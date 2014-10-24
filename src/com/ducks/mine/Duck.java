package com.ducks.mine;

//But now we need ducks to fly() too

public class Duck 
{
	void quack();
	void swim();
	void display();
	
	//So we add a fly() here
	void fly();
	//Now the problem is, all the ducks inherti this class, and all will be able to fly now
	//which is a huge problem.
	
	//Other duck like methods
}
