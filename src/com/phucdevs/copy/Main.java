package com.phucdevs.copy;

import com.phucdevs.object.Grade;
import com.phucdevs.object.Student;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Shallow copy like:");
        shallowCopy();
        System.out.println("--------------------------------");

        System.out.println("Deep copy 1 like:");
        deepCopy1();
        System.out.println("--------------------------------");

        System.out.println("Deep copy 2 like:");
        deepCopy2();
        System.out.println("--------------------------------");
    }

    static void shallowCopy() {
        Grade grade = new Grade("G001", "Grade 9");
        Student student = new Student("S001", "John", 20, grade);
        Student shallowCopyStudent = new Student(student.getCode(),
                                                student.getFullName(),
                                                student.getAge(),
                                                student.getGrade());

        // When change value properties in object student -> change object student in shallow copy object
        grade.setName("Grade 8");

        shallowCopyStudent.getGrade().getName().equals(student.getGrade().getName()); // true

    }

    static void deepCopy1() {
        Grade grade = new Grade("G001", "Grade 9");
        Student student = new Student("S001", "John", 20, grade);
        Student deepCopyStudent = new Student(student.getCode(),
                student.getFullName(),
                student.getAge(),
                student.getGrade());

        // When change value properties in object student -> don't change object student in deep copy object
        grade.setName("Grade 8");

        deepCopyStudent.getGrade().getName().equals(student.getGrade().getName()); // false
    }

    static void deepCopy2() {
        Grade grade = new Grade("G001", "Grade 9");
        Student student = new Student("S001", "John", 20, grade);
        Student deepCopyStudent = (Student) student.clone();

        // When change value properties in object student -> don't change object student in deep copy object
        grade.setName("Grade 8");

        deepCopyStudent.getGrade().getName().equals(student.getGrade().getName()); // false
    }
}
