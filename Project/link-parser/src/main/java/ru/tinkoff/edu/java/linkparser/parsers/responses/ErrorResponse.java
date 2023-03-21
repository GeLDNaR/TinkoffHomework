package ru.tinkoff.edu.java.linkparser.parsers.responses;

public record ErrorResponse() implements Response{

    private static final Response error = null;
    public Response getError() {
        return error;
    }
    @Override
    public String toString() {
        return "ErrorResponse";
    }
}
