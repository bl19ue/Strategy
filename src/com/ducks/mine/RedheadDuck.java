package com.ducks.mine;

public class RedheadDuck extends Duck implements QuackBehaviour
{
	void display()
	{
		System.out.println("Looks like RedHead duck");
	}

	@Override
	public void quack() 
	{
		System.out.println("Quacks like RedHead Duck");	
	}
}
