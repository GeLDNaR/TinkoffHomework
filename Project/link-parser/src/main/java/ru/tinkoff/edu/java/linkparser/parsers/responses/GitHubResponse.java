package ru.tinkoff.edu.java.linkparser.parsers.responses;

public record GitHubResponse(String user, String repository) implements Response {
    @Override
    public String toString() {
        return "GitHubResponse user = " + user + ", repository = " + repository;
    }
}
