package com.inetbanking.testData;

public class Practice_02 {

	public static void main(String[] args) {

		int num=123;

		int count=0;
		while(num>0)
		{
			int rem=num%10;     //10)123(12
			count++;            //    10 
			num=num/10;         //    23
		}                       //    20
		System.out.println(count);
		
	}

}
