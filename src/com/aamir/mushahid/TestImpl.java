package com.aamir.mushahid;
interface Hey{
	void test();
}
public class TestImpl implements Hey{
public void test() {
	System.out.println("hello");
}
public static void main(String[] args) {
	Hey t= new TestImpl();
	t.test();
}
}


