package com.inetbanking.utilities;

public class OOPS {

	int emp1;
	int Number;
	String Name;
	String Position;
	String Location;
	
	void data() {
		System.out.println(emp1);
		System.out.println(Number);
		System.out.println(Name);
		System.out.println(Position);
		System.out.println(Location);
		
	}
	
	public static void main(String[] args) {
		OOPS oop1=new OOPS();
		oop1.emp1=1;
	    oop1.Number=01;
		oop1.Name="obul";
		oop1.Position="Test Engineer";
		oop1.Location="Hyderabad";
		oop1.data();
		
		OOPS oop2=new OOPS();
		oop1.emp1=2;
		oop1.Number=02;
		oop1.Name="kamal";
		oop1.Position="Test Engineer";
		oop1.Location="Hyderabad";
		oop1.data();
		
	}
}
