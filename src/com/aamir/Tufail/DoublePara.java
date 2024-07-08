package com.aamir.Tufail;
interface Shoib{
	int mobile(int a,int b);
}
public class DoublePara {
	public static void main(String[] args) {
		Shoib st=(a,b)->{
			if(a>b) {
			throw new RuntimeException("a is not found");
			
			}
			return b;
		
		};
	System.out.println(st.mobile(10, 14));
		
	}

}
