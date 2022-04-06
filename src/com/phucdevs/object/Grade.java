package com.phucdevs.object;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Grade{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Objects.equals(code, grade.code) && Objects.equals(name, grade.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}
