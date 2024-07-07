package com.aamir;

@FunctionalInterface
interface LambdaInterface {
    void ram();
}

public class LambdaApproach {

    // () -> sout()
    public static void main(String[] args) {
        LambdaInterface lambdaInterface = () -> System.out.println("52 GB");
        lambdaInterface.ram();
    }


}
