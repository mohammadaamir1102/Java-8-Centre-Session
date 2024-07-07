package com.aamir;

interface AamirLambdaDoubleParamWithReturnType {
    int sum(int a, int b);
}

public class LambdaDoubleParamWithReturnType {
    public static void main(String[] args) {
//        AamirLambdaDoubleParamWithReturnType aldpwrt = (firstParam, secondParam) -> {
//            return firstParam+secondParam;
//        };
//        AamirLambdaDoubleParamWithReturnType aldpwrt = (firstParam, secondParam) -> firstParam + secondParam;

        AamirLambdaDoubleParamWithReturnType aldpwrt = Integer::sum;

        System.out.println(aldpwrt.sum(10, 10));
    }
}
