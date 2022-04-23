package com.phucdevs.common;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        CustomerFinal customerFinal = new CustomerFinal("Phuc", 15);
        System.out.println(customerFinal.toString());
        customerFinal.setName("Toan");
        customerFinal.setAge(20);
        System.out.println(customerFinal.toString());
    }
}
