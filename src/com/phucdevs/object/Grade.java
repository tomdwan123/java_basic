package com.phucdevs.object;

/**
 * @author Phuc.Le
 */
public class Grade {

    private final String code;
    private final String name;

    public Grade(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
