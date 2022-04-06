package com.phucdevs.compare;

import com.phucdevs.object.Grade;

import java.util.List;
import java.util.Objects;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("1. Compare 2 Strings like: ");
        System.out.println(compareTwoStrings("hello", "hello")); // true true true

        String s1 = "world";
        String s2 = "world";
        System.out.println(compareTwoStrings(s1, s2)); // true true true

        String s3 = new String("text");
        String s4 = new String("text");
        System.out.println(compareTwoStrings(s3, s4)); // false true true
        System.out.println("--------------------------------");

        System.out.println("2. Compare 2 Ints like: ");
        System.out.println(compareTwoInts(3,3));

        int n3 = 4;
        int n4 = 4;
        System.out.println(compareTwoInts(n3, n4));

        Integer n5 = new Integer(5);
        Integer n6 = new Integer(5);
        System.out.println(compareTwoInts(n5, n6));
        System.out.println("--------------------------------");

        System.out.println("3. Compare 2 single Objects like: ");
        Grade g1 = new Grade("G001", "Grade 9");
        Grade g2 = g1;
        System.out.println(g1.hashCode() + "---" + g2.hashCode());
        System.out.println(compareTwoSingleObjects(g1, g2));
        System.out.println("--------------------------------");

        Grade g3 = new Grade("G002", "Grade 8");
        Grade g4 = new Grade("G002", "Grade 8");
        System.out.println(g3.hashCode() + "---" + g4.hashCode());
        System.out.println(compareTwoSingleObjects(g3, g4));

        System.out.println("4. Compare 2 multi Objects like: ");


        System.out.println("--------------------------------");
    }

    static List<Boolean> compareTwoStrings(String s1, String s2) {
        return List.of(
            s1 == s2,
            s1.equals(s2),
            Objects.equals(s1, s2)
        );
    }

    static List<Boolean> compareTwoInts(Integer n1, Integer n2) {
        return List.of(
            n1 == n2,
            n1.equals(n2),
            Objects.equals(n1, n2)
        );
    }

    static List<Boolean> compareTwoSingleObjects(Grade g1, Grade g2) {
        return List.of(
            g1 == g2,
            g1.equals(g2),
            Objects.equals(g1, g2)
        );
    }
}
