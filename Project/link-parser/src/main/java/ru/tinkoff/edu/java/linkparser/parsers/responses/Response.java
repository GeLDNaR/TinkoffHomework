package ru.tinkoff.edu.java.linkparser.parsers.responses;

public sealed interface Response permits GitHubResponse, StackOverflowResponse, ErrorResponse{

}
