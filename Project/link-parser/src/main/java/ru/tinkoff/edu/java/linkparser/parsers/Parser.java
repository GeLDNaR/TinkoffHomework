package ru.tinkoff.edu.java.linkparser.parsers;

import ru.tinkoff.edu.java.linkparser.parsers.responses.Response;

import java.net.URL;

public sealed interface Parser permits GithubParser, StackOverflowParser {
    public Response parse (URL url);
}
