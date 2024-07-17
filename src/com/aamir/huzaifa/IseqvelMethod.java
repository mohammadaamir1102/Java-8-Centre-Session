package com.aamir.huzaifa;
import java.util.function.Predicate;
public class IseqvelMethod {
	    public static void main(String[] args) {
	        Predicate<Double> isEqualToPi = Predicate.isEqual(3.14);

	        double[] values = {3.14, 2.71, 1.61, 3.14, 4.20};

	        for (double value : values) {
	            if (isEqualToPi.test(value)) {
	                System.out.println(value + " is equal to 3.14");
	            } else {
	                System.out.println(value + " is not equal to 3.14");
	            }
	        }
	    }
	}


