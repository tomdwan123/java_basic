package com.phucdevs.object;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(code, student.code) && Objects.equals(fullName, student.fullName) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, fullName, age, grade);
    }
}
