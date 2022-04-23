package com.phucdevs.generic;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        Integer i1 = convertStringToNumber("", 0);
        Integer i2 = convertStringToNumber("5", 0);
        Long l1 = convertStringToNumber("", -1L);
        Long l2 = convertStringToNumber("5", 100L);
        System.out.println(i1 + " " + i2 + " " + l1 + " " + l2);
    }

    static <T> T convertStringToNumber(String strValue, T defaultValue) {
        if (strValue.isEmpty()) return defaultValue;
        if (defaultValue instanceof Integer) return (T) strValue;
        if (defaultValue instanceof Long) Long.valueOf(strValue);
        if (defaultValue instanceof Double) Double.valueOf(strValue);

        return null;
    }
}
