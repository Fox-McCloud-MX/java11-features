package com.mx.java11.features._string;

public class IsBlank {
    public static void main(String[] args) {

        System.out.println(" ".isBlank()); //true

        String s = "Testing";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
    }
}
