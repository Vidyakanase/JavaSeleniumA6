package com.NonPT;

public class Employee extends Person {
	
	private static int age;
	private static String name;
	int eid;
	double sal;
 Employee(){
	  super(name,age);
	  this.eid=eid;
	  this.sal=sal;
 }
 
	// TODO Auto-generated constructor stub

 public void print() {
	 System.out.println("Employee Name+name");
	 System.out.println("Employee Age+age");
	 System.out.println("Employee Id+eid");
	 System.out.println("Employee Salary+sal");
	 System.out.println("====================");
	 
 }

	
 }


