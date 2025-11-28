package com.inetbanking.testData;

public class SDET_Question_04 {

	public static void main(String[] args) {

		int num=121;
		int rev=0;
		int palin=num;
		
		while(num>0)
		{
			int rem=num%10;
			    rev=rev*10+rem;
			    num=num/10;
		}
		
		if (palin==rev)
		{
			System.out.println("num is a palindrome");
		}
		
	}

}
