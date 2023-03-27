package ru.tinkoff.edu.java.linkparser.parsers.client;

import lombok.ToString;
import ru.tinkoff.edu.java.linkparser.parsers.GithubParser;
import ru.tinkoff.edu.java.linkparser.parsers.LinkNames;
import ru.tinkoff.edu.java.linkparser.parsers.Parser;
import ru.tinkoff.edu.java.linkparser.parsers.StackOverflowParser;
import ru.tinkoff.edu.java.linkparser.parsers.responses.ErrorResponse;
import ru.tinkoff.edu.java.linkparser.parsers.responses.Response;

import java.net.URL;
import java.util.Map;

@ToString
public class LinkProcessor {
    public static final Map<String, Parser> parsers = Map.of(GITHUB, new GithubParser(), STACKOVERFLOW, new StackOverflowParser());

    public Response parseLink(URL url) {
        String host = url.getHost();
        if (parsers.containsKey(host)) {
            return parsers.get(host).parse(url);
        } else
            return new ErrorResponse().getError();
    }
}
