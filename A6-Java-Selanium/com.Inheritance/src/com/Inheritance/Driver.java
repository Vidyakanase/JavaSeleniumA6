package com.Inheritance;

public class Driver {

	public static void main(String[] args) {
		//Accessing parent class Member using child class
		System.out.println(Cardiologist.name);
		System.out.println(Cardiologist.drlno);
		Cardiologist.Checkup();
		Cardiologist.Checkpulse();
	//Accessing child class Member Using child class name
		Cardiologist.Checkpulse();
	//Accessing parent class Member using parent class
		System.out.println(Doctor.name);
		System.out.println(Doctor.drlno);
		Doctor.Checkup();
		Doctor.Checkpulse();
		/*Not able to access Child class member parent class name*/
		  //Doctor.bypassSurgery();

	}

}
