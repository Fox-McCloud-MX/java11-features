package com.mx.java11.features._string;

import java.util.stream.Collectors;

public class Lines {
    public static void main(String[] args) {

        String str = "LINE\nLINE\nLINE";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList())); //[LINE, LINE, LINE]
    }
}
