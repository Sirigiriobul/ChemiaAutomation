package com.inetbanking.utilities;

public class AllPractice {
	public static void main(String[] args) {

//		
//		int a[][]=new int [2][2];
		
//		a[0][0]=100;
//		a[0][1]=200;
//		
//		
//		a[1][0]=10;
//		a[1][1]=20;
//		
//		System.out.println(a.length);
//		System.out.println(a[0].length);
		
//		int a[][]= {{1,2}, {10,20}, {100,200}};
//		
//		for (int i=0;i<a.length;i++)
//		{
//			for (int j=0;j<a[i].length;i++)
//			{
//			System.out.println(a[i][j]);
//			}
//		}
//		
		
		int a[][]= {{1,2} ,{10,20}};
		
		for (int r[]:a)
		{
			for (int i:r)
			{
				System.out.println(i);
			}
		}
		
	}

}
