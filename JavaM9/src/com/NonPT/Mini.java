package com.NonPT;
public class Mini extends Cab {
	{
		System.out.println("===Your Mini is Booked===");
	}
	String minibrand;
	int seats;
	double fair;
	double bootspace;
	
	Mini(String cabdrivername,int cabno,String color,long phno,String minibrand,int seats,double fair,double bootspace) 
	    {
		 super();
		 this.minibrand=minibrand;
		 this.seats=seats;
		 this. fair=fair;
		 this.bootspace=bootspace;
	    }
	 public void cabdetails() {
		 System.out.println("Cab Driver Name:+name");
		 System.out.println("Cab Number:+cabno");
		 System.out.println("Cab color:+color");
		 System.out.println("Driver No:+phno");
		 System.out.println("Car Brand:+minibrand");
		 System.out.println("Seats:+seats");
		 System.out.println("Fair:+fair");
		 System.out.println("Bootspace:+bootspace");
	 }


		
	}


