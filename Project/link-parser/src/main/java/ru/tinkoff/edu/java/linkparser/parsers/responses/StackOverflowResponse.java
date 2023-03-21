package ru.tinkoff.edu.java.linkparser.parsers.responses;

public record StackOverflowResponse(String id) implements Response {
    @Override
    public String toString() {
        return "StackOverflowResponse id = " + id;
    }
}
