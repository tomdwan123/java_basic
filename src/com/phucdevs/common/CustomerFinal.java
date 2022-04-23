package com.phucdevs.common;

/**
 * @author Phuc.Le
 */
public final class CustomerFinal {

    private String name;
    private int age;

    public CustomerFinal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerFinal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
