package ru.tinkoff.edu.java.linkparser.parsers;

import org.springframework.stereotype.Component;
import ru.tinkoff.edu.java.linkparser.parsers.responses.GitHubResponse;
import ru.tinkoff.edu.java.linkparser.parsers.responses.Response;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public record GithubParser() implements Parser {

    public Response parse(URL url) {
        String[] elementsPath = url.getPath().split("/");
        List<String> responseFields = Arrays.asList(elementsPath).stream()
                .filter(Objects::nonNull)
                .filter(Predicate.not(String::isEmpty)).limit(2).collect(Collectors.toList());
        return new GitHubResponse(responseFields.get(0), responseFields.get(1));
    }
}
