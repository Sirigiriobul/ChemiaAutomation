package com.inetbanking.testData;

public class SDET_Question_06_TotalDigitsInANumber {

	public static void main(String[] args) {
int a=1234678;
int count=0;

while(a>0)
{
	a=a/10;
	count++;
	
}
System.out.println(count);

	}

}
