package com.ducks.mine;

/*
 * What a shame, we have all the dynamic talent, but we are not using it 
 * */

public class Duck 
{
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	void swim()
	{
		System.out.println("I swim");
	}
	
	void display()
	{
		System.out.println("See me");
	}
	
	void performQuack()// These methods replace the fly() and quack()
	{
		quackBehaviour.quack();
	}
	void performFly()
	{
		flyBehaviour.fly();
	}
	void setFlyBehaviour(FlyBehaviour fb)
	{
		flyBehaviour = fb;
	}
	void setQuackBehaviour(QuackBehaviour qb)
	{
		quackBehaviour = qb;
	}
	
	//Now we can create a new Fly behaviour, let's do it
	
	//Other duck like methods
}

/*
 * Program to an implementation would be:
 * Dog d = new Dog();
 * d.bark();
 * 
 * Program to an interface:
 * Animal a = new Dog();
 * a.bark();
 * 
 * Even better, rather than hardcoding it, 
 * 
 * Animal a = getAnimal();//We dont know what the actual subtype is
 * a.makeSound();
 * 
 * 
 * */
