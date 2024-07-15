package com.aamir.faiz;

interface DoublePara {
	int checkGreaterValue(int fi, int sec);
}

public class CompareDoubleParam {
	public static void main(String[] args) {
		DoublePara dp = (fi, sec) -> {
			if (fi > sec) {
				throw new RuntimeException("fi can not be greater that second");
			}
			return sec;
		};

		System.out.println(dp.checkGreaterValue(10, 20));

	}

}
