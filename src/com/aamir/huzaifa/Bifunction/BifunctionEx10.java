package com.aamir.huzaifa.Bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class A{

    int id;
    String name;
     A(int id,String name){
         this.id=id;
         this.name=name;
     }
}
public class BifunctionEx10 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> multiply = (a, b) -> Math.multiplyExact(a, b);
            System.out.println(multiply.apply(10, 5));

            List<A>list=new ArrayList<>();
            list.add(new A(1,"djh"));
            list.add(new A(1,"dsfd"));

        }
    }


