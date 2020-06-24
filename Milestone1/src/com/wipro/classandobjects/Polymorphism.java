package com.wipro.classandobjects;
class Fruit {
	String name;
	String taste;
	int size;
	public Fruit() {
		name = "Fruit";
		taste = "Sweet";
		size = 0;
	}
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}
class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like apple");
	}
}
class Orange extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like Orange");
	}
}
public class Polymorphism {
public static void main(String[]args)
{
	Fruit f=new Fruit();
	Apple a=new Apple();
	Orange o=new Orange();
	f.eat();
	a.eat();
	o.eat();
}
}
