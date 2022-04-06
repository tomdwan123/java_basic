package com.phucdevs.object;

import java.util.Objects;

/**
 * @author Phuc.Le
 */
public class Student {

    private String code;
    private String fullName;
    private int age;
    private Grade grade;

    public Student(String code,
                   String fullName,
                   int age,
                   Grade grade) {
        this.code = code;
        this.fullName = fullName;
        this.age = age;
        this.grade = grade;
    }

    public Student(Student student) {
        this.code = student.code;
        this.fullName = student.fullName;
        this.age = student.age;
        this.grade = new Grade(student.grade);
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

    @Override
    public Object clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            student = new Student(this.getCode(),
                                this.getFullName(),
                                this.getAge(),
                                this.getGrade());
        }
        student.grade = (Grade) this.grade.clone();
        return student;
    }
}
