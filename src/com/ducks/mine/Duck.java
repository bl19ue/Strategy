package com.ducks.mine;

/*
 * Now, as far we can see, other than fly and quack, the Duck class will stay the same.
 * So it wont change, just a bit maybe
 * Now to separate what changes from those that stays alone, we will create two different sets of classes
 * One for fly and one for quack
 * So we will create 2 classes, each set will contain all implementations of their respective behaviour
 * 
 *  Ex. one class that immplements quacking, another-squeaking, and silence too.
 *  
 *  ****************************************************************************************************
 *  So that teaches us "Program to an interface, not an implementation!!!"
 * */

public class Duck 
{
	
	void swim();
	void display();
	
		
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
