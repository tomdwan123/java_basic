package com.phucdevs.object;

import java.util.Objects;

/**
 * @author Phuc.Le
 */
public class Grade {

    private String code;
    private String name;

    public Grade(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Grade(Grade grade) {
        this.code = grade.code;
        this.name  = grade.name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public Object clone() {
        try {
            return (Grade) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Grade(this.getCode(), this.getName());
        }
    }
}
