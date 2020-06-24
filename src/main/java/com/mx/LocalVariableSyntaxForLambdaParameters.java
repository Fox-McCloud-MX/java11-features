package com.mx;

import java.util.ArrayList;

public class LocalVariableSyntaxForLambdaParameters {

    public static void main(String[] args) {

        //(var s1, var s2) -> s1 + s2;
        //(var s1, s2) -> s1 + s2 //no skipping allowed
        //(var s1, String y) -> s1 + y //no mixing allowed
        //var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.
    }
}
