package com.phucdevs.design.pattern.builder;

public class BuilderPatternMain {

    public static void main(String[] args) {
        URLBuilder urlBuilder = new URLBuilder.Builder()
                .protocol("https://")
                .hostname("phucdevs")
                .port(":8080/")
                .pathParam("home?")
                .queryParam("index=1")
                .build();

        StringBuilder urlOutput = new StringBuilder()
                .append(urlBuilder.protocol)
                .append(urlBuilder.hostname)
                .append(urlBuilder.port)
                .append(urlBuilder.pathParam)
                .append(urlBuilder.queryParam);
        System.out.printf(urlOutput.toString());
    }
}
