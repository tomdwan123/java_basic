package com.phucdevs.copy;

import com.phucdevs.common.UserService;
import com.phucdevs.object.Grade;
import com.phucdevs.object.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        //checkNullObject();
        Grade grade = new Grade("G001", "Grade 9");
        grade.setCode("aa");

        Integer n1 = 256;
        Integer n2 = 256;
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        int n = 5;
        valueTypeForArgument(5);
        System.out.println("argument with value type is " + n);

        String s = "hello";
        referenceTypeForArgumentString(s);
        System.out.println("argument with reference type String is " + s);

        Integer nu = 10;
        referenceTypeForArgumentNumber(nu);
        System.out.println("argument with reference type Number is " + nu);

        List<String> collections = new ArrayList<>();
        referenceTypeForArgumentCollection(collections);
        System.out.println("argument with reference type Collections is " + collections);

        Student student = new Student(
                "NV001",
                "Phuc Le",
                20,
                new Grade("G001", "9")
        );
        referenceTypeForArgumentClass(student);
        System.out.println(student.getAge());

        //fizzBuzz(15);
        //System.out.println("Shallow copy like:");
        //shallowCopy();
        //System.out.println("--------------------------------");

        //System.out.println("Deep copy 1 like:");
        //deepCopy1();
        //System.out.println("--------------------------------");

        //System.out.println("Deep copy 2 like:");
        //deepCopy2();
        //System.out.println("--------------------------------");
    }

    public static void checkNullObject() {
        List<Grade> gradesByEmptyList = UserService.getGradesByEmptyList();
        gradesByEmptyList.add(
                new Grade("G001", "Grade 9")
        );
        System.out.println(gradesByEmptyList); // exception with immutable object

        List<Grade> gradesByNewArrayList = UserService.getGradesByNewArrayList();
        gradesByNewArrayList.add(
                new Grade("G002", "Grade 8")
        );
        System.out.println(gradesByNewArrayList); // add normal with mutable object
    }

    public static void valueTypeForArgument(int n) {
        n = n + 1;
    }

    public static void referenceTypeForArgumentNumber(Integer n) {
        n = n + 1;
    }

    public static void referenceTypeForArgumentString(String s) {
        s = s + " concat";
    }

    public static void referenceTypeForArgumentCollection(List<String> collections) {
        collections.add("first string");
        collections.add("first string");
        collections.add("first string");
    }

    public static void referenceTypeForArgumentClass(Student student) {
        student.setAge(student.getAge() + 1);
    }

    public static void closestNumbersMethod3(List<Integer> numbers) {
        if (numbers.size() < 2 || numbers.size() > (Math.pow(10, 5))) {
            return;
        }

        // sort ascending list number
        Collections.sort(numbers);

        int minClosest = Integer.MAX_VALUE;
        Map<Integer, Integer> outputs = new HashMap<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentCloses = Math.abs(numbers.get(i) - numbers.get(i + 1));
            if (currentCloses == 0) continue;

            if (currentCloses == minClosest) {
                outputs.put(numbers.get(i), numbers.get(i + 1));
            } else if (currentCloses < minClosest) {
                minClosest = currentCloses;
                outputs.clear();
                outputs.put(numbers.get(i), numbers.get(i + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : outputs.entrySet()) {
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static int divide (int a, int b) {
        int c = -1;
        try {
            c = a/b;
        } catch (Exception e) {
            System.err.print("Exception");
        } finally {
            {
                System.err.println("Finally");
            }
        }

        return c;
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

    public static void fizzBuzz(int n) {
        // test upper limit of n
        if (n > 2 * (10*10*10*10*10))
            System.out.println("NONE");

        // implement logic
        List<String> outputs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                outputs.add("FizzBuzz");
                continue;
            }

            if (i % 5 == 0) {
                outputs.add("Buzz");
                continue;
            }

            if (i % 3 == 0) {
                outputs.add("Fizz");
                continue;
            }

            if (i % 3 !=0 && i % 5 != 0) {
                outputs.add(String.valueOf(i));
                continue;
            }
        }

        for (String output : outputs) {
            System.out.println(output);
        }
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
