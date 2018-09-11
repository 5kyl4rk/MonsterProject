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
		myMonster = new MarshmallowMonster("Autismo", 4.2, 6, false, 2);
	}
	public void start()
	{
		System.out.println(myMonster);
	}
}
