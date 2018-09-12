package controller;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Tizmo", 6.5, 3, true, 4, "no u");
	}
	public void start()
	{
		System.out.println(myMonster.getCatchphrase());
	}
}
