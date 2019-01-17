package com.hen.collections;

public class PersonValidator {

    public void validate(String str) {
        if (str.length() < 2 || str.length() > 15 || str.isEmpty()) {

            System.out.println("data input to short or too long");
            throw new IllegalArgumentException();
        }
    }

    public void validateGen(String str) {
        if (!str.equalsIgnoreCase("male") && !str.equalsIgnoreCase("female") || str.isEmpty()) {

            System.out.println("data input is not male or female");
            throw new IllegalArgumentException();
        }
    }

    public void validateAge(Integer i) {
        if (i > 110 || i < 0|| i == null) {

            System.out.println("data input must be a number from 0 to 110");
            throw new IllegalArgumentException();
        }
    }
}