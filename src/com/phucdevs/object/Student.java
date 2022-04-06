package com.phucdevs.object;

/**
 * @author Phuc.Le
 */
public class Student {

    private final String code;
    private final String fullName;
    private final int age;
    private final Grade grade;

    public Student(String code,
                   String fullName,
                   int age,
                   Grade grade) {
        this.code = code;
        this.fullName = fullName;
        this.age = age;
        this.grade = grade;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }
}
