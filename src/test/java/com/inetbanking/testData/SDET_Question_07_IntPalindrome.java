package com.inetbanking.testData;

public class SDET_Question_07_IntPalindrome {

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
		System.out.println(rev);
		if(palin==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
	}

}

}