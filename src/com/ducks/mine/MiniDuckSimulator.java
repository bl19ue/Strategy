package com.ducks.mine;

public class MiniDuckSimulator {

	public static void main(String[] args) 
	{
		Duck model = new MallardDuck();
		model.performFly();
		
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}

}
