package com.mx;

import java.util.Objects;

/*
Java 11 nested access control addresses this concern in reflection.
java.lang.Class introduces three methods in the reflection API:
    getNestHost(),
    getNestMembers() and
    isNestmateOf()
 */
public class NestedAccessControlAddresses {
    private static Object String;

    public static void main(String[] args) {
        NestedAccessControlAddresses nestedAccessControlAddresses = new NestedAccessControlAddresses();

        // Returns the nest host of the nest to which the class or
        // interface represented by this Class object belongs.
        nestedAccessControlAddresses.getClass().getNestHost();

        // Returns an array containing Class objects representing
        // all the classes and interfaces that are members of the
        // nest to which the class or interface represented by
        // this Class object belongs.
        nestedAccessControlAddresses.getClass().getNestMembers();

        // Determines if the given Class is a nestmate of the class
        // or interface represented by this Class object.
        nestedAccessControlAddresses.getClass().isNestmateOf((Class<?>) String);
    }
}
