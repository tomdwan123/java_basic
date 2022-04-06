package com.phucdevs.override;

import com.phucdevs.object.Grade;
import com.phucdevs.object.Student;

import java.util.List;
import java.util.Objects;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Override method toString() of object like:");
        Grade g001 = new Grade("G001", "Grade 9");
        System.out.println(g001.toString());
        System.out.println("--------------------------------");

        System.out.println("Override method equals() of object like:");
        Grade g002 = new Grade("G002","Grade 8");
        Grade g003 = new Grade("G002", "Grade 8");
        Grade g004 = g003;
        Grade g005 = (Grade) g003;
        System.out.println(compareTwoSingleObjectsOverride(g002, g003)); // false true true
        System.out.println(compareTwoSingleObjectsOverride(g003, g004)); // true true true
        System.out.println(compareTwoSingleObjectsOverride(g003, g005)); // true true true
        System.out.println("--------------------------------");

        System.out.println("Compare 2 mutil objects like:");
        Student s1 = new Student("S001", "John", 20, g001);
        Student s2 = new Student("S001", "John", 20, g001);
        Student s3 = s2;
        System.out.println(compareTwoMutilObjectsOverride(s1, s2)); // no override equals():  false false false
                                                                    // override equals():  false true true
        System.out.println(compareTwoMutilObjectsOverride(s2, s3)); // true true true
        System.out.println("--------------------------------");
    }

    static List<Boolean> compareTwoSingleObjectsOverride(Grade g1, Grade g2) {
        return List.of(
                g1 == g2,
                g1.equals(g2),
                Objects.equals(g1, g2)
        );
    }

    static List<Boolean> compareTwoMutilObjectsOverride(Student s1, Student s2) {
        return List.of(
            s1 == s2,
            s1.equals(s2),
            Objects.equals(s1, s2)
        );
    }
}
