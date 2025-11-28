package com.inetbanking.testData;

public class PracticeClass {
	public static void main(String[] args) {

		int even = 0;
		int odd = 0;
		int num = 12345678;

		while (num > 0) {
			int rem = num % 10;

			if (rem % 2 == 0) {
				even++;

			} else {
				odd++;
			}
			num = num / 10;
		}
System.out.println(even+""+odd);
	}
}