package com.aamir.huzaifa.supplier;

import java.util.function.Supplier;

class Params {
            private final int a;
            private final int b;

            public Params (int a, int b) {
                this.a = a;
                this.b = b;
            }
            public int getA() {
                return a;
            }
            public int getB() {
                return b;
            }
        }
        public class SuplierEx8  {
            public static void main(String[] args) {
                Supplier<Params> paramsSupplier = () -> new Params(10, 20);
                Params params = paramsSupplier.get();
                System.out.println("Parameters: a = " + params.getA()+ ", b = "+ params.getB());
            }
        }



