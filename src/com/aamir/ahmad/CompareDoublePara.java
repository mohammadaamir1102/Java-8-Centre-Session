package com.aamir.ahmad;

	interface DoubleParam{
		int checkGreaterValue(int fi,int sec);
	}
	public class CompareDoublePara {
		public static void main(String[] args) {
			DoubleParam dp=(fi,sec)->{
				if(fi>sec) {
					throw new RuntimeException("fi can not be greater that second");
				}
				return sec;
			};
			
			System.out.println(dp.checkGreaterValue(10, 20));
			
		}

	}

