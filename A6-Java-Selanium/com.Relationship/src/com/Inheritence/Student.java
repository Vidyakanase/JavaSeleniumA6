package com.Inheritence;

public class Student extends Person {

	int sid;
	double fees;
	String course;
	Student(String name ,int age,String gender,int sid,double fees,String course)
	{
	
     super(name ,age ,gender);
	  this.sid=sid ;
	  this.fees=fees;
	  this.course=course;
	
	}
	
	
	public void printDetail()
	{
	 System.out.println("student name:"+name);
	 System.out.println("student age:"+age );
	 System.out.println("student gender:"+gender);
	 System.out.println("student Id:"+sid);
	 System.out.println("student fees:"+fees);
	 System.out.println("student course:"+course );
	 System.out.println("=======================");  
	 }
}
	 



