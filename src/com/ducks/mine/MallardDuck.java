package com.ducks.mine;

/*
 * Now we have to take care about how the flyBehavior nstance variable are set
 * 
 * */

public class MallardDuck extends Duck implements FlyBehaviour
{
	public MallardDuck()
	{
		quackBehaviour = new Quack();//<- Quack, class which implements QuackBehavior
		flyBehaviour = new FlyWithWings();
		
		/*
		 * Wait a second! what we are doing here!!
		 * We are making a new instance of a concrete Quack and FlyWithThings!!
		 * We should NOT program to an implementation!
		 * */
	}
	void display()
	{
		System.out.println("Looks like mallard duck");
	}
	
	@Override
	public void fly()
	{
		System.out.println("I fly like a mallard duck");
	}
	
}
