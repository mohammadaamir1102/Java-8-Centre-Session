package com.aamir;

interface AamirLambdaSingleParam {
    void number(int number);
}

public class LambdaSingleParam {

    public static void main(String[] args) {
        AamirLambdaSingleParam alsp = (number) -> System.out.println("Number is " + number );
        alsp.number(786);
    }
}
