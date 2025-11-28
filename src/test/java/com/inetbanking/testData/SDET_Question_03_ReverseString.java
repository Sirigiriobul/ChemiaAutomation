package com.inetbanking.testData;

public class SDET_Question_03_ReverseString {

	public static void main(String[] args) {
		String s="obul";
		String rev="";
		int length=s.length();
		
		for (int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	
//		
//		//Second approach
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println(sb.reverse());
	}
}
