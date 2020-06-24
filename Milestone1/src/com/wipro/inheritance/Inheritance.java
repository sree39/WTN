package com.wipro.inheritance;
class Animal{
	public void eat () {
		System.out.println("Animal eats...");
	}
	
	public void sleep () {
		System.out.println("Animal sleeps...");
	}
}
class Bird extends Animal {

	@Override
	public void eat () {
		System.out.println("Bird eats..");
	}
	
	@Override
	public void sleep () {
		System.out.println("Bird sleeps...");
	}
	
	public void fly () {
		System.out.println("Bird flys...");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Animal a = new Animal();
	Bird b=new Bird();
	a.eat();
	a.sleep();
	b.eat();
	b.sleep();
	b.fly();
	
	}
}
