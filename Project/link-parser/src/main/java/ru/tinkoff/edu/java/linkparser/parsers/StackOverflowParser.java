package ru.tinkoff.edu.java.linkparser.parsers;

import ru.tinkoff.edu.java.linkparser.parsers.Parser;
import ru.tinkoff.edu.java.linkparser.parsers.responses.ErrorResponse;
import ru.tinkoff.edu.java.linkparser.parsers.responses.Response;
import ru.tinkoff.edu.java.linkparser.parsers.responses.StackOverflowResponse;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public record StackOverflowParser() implements Parser {

    public Response parse(URL url) {
        String[] elementsPath = url.getPath().split("/");
        List<String> responseFields = Arrays.asList(elementsPath).stream().filter(Objects::nonNull)
                .filter(Predicate.not(String::isEmpty)).limit(2).collect(Collectors.toList());
        if (responseFields.contains("questions")) {
            return new StackOverflowResponse(responseFields.get(1));
        }
        else {
            return new ErrorResponse().getError();
        }
    }
}
