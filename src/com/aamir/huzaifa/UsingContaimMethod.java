package com.aamir.huzaifa;
import java.util.function.Predicate;
public class UsingContaimMethod {
	    public static void main(String[] args) {
	        Predicate<String> containsSubStr = str -> str.contains("test");
	        
	        System.out.println(containsSubStr.test("this is a test"));  
	        System.out.println(containsSubStr.test("hello world"));     
	    }
	}



