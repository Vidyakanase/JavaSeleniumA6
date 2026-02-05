package com.Inheritence;

public class DogDriver {
	public static void  main (String [] args) {
//Object of dog (sub class)
	Dog d = new Dog();
//Accessing Member of Dog class
	System.out.println(d.breed);
	System.out.println(d.tail +"cm");
	d.bark();
//Accessing Member of Animal class
	System.out.println(d.name);
	System.out.println(d.color);
	d.eat();
//Object of Animal(Super class)
	Animal a =new Animal();
//Accessing Member of Animal class
	System.out.println(a.name);
	System.out.println(a.color);
	a.eat();

	
	
	
	}

}
