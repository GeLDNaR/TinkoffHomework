package ru.tinkoff.edu.java.linkparser;

import ru.tinkoff.edu.java.linkparser.parsers.client.LinkProcessor;

import java.net.MalformedURLException;
import java.net.URL;

public class LinkParserApplication {
    public static void main(String[] args) throws MalformedURLException {
        LinkProcessor linkProc = new LinkProcessor();
        URL firstUrl = new URL("https://github.com/sanyarnd/tinkoff-java-course-2022/");
        System.out.println(linkProc.parseLink(firstUrl));
        URL secondUrl = new URL("https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c");
        System.out.println(linkProc.parseLink(secondUrl));
        URL thirdUrl = new URL("https://stackoverflow.com/search?q=unsupported%20link");
        System.out.println(linkProc.parseLink(thirdUrl));
    }
}
