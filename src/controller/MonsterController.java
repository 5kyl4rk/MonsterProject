package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	// Data member section
	// Declaration section
	Scanner inputMonster = new Scanner(System.in);
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;

	// Constructors initialize data members
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Tizmo", 6.5, 3, true, 4, "no u");
		userMonster = new MarshmallowMonster();
	}

	public void start()
	{
		System.out.println(myMonster);

		setUpMonster();

	}

	private void setUpMonster()
	{
		System.out.println("What is the name of your monster?");
		String response = inputMonster.nextLine();
		userMonster.setName(response);
		System.out.println("Your monster's name is " + userMonster.getName()/* +"?" */);
		// add in validation maybe?

		System.out.println("How many legs does it have?");
		response = inputMonster.next();
		while (!validDouble(response))
		{
			inputMonster.nextLine();
			response = inputMonster.next();
		}
		userMonster.setLegCount(Double.parseDouble(response));
		System.out.println("Your monster has " + userMonster.getLegCount() + " legs");

		
		System.out.println("How many eyes does it have?");
		response = inputMonster.next();
		while (!validInt(response))
		{
			inputMonster.nextLine();
			response = inputMonster.next();
		}

		
		userMonster.setEyeCount(Integer.parseInt(response));
		System.out.println("Your monster has " + userMonster.getEyeCount() + " eyes");

		inputMonster.nextLine();

		
		System.out.println("Does your monster have a nose?");
		boolean valid = false;
		while (!valid)
		{
			response = inputMonster.nextLine();
			if (response.toLowerCase().equals("yes") || response.toLowerCase().equals("true"))
			{
				userMonster.setHasNose(true);
				valid = true;
				System.out.println("Your monster has a nose");
			}
			else if (response.toLowerCase().equals("no") || response.toLowerCase().equals("false"))
			{
				userMonster.setHasNose(false);
				valid = true;
				System.out.println("Your monster has no nose");
			}
			else
			{
				System.out.println("Please type either yes/no or true/false");
			}
		}

		
		System.out.println("How many arms does it have?");
		response = inputMonster.next();
		while (!validInt(response))
		{
			inputMonster.nextLine();
			response = inputMonster.next();
		}
		userMonster.setArmCount(Integer.parseInt(response));
		System.out.println("Your monster has " + userMonster.getArmCount() + " arms");

		
		inputMonster.nextLine();

		System.out.println("Finally, what is your monster's favorite thing to say?");
		response = inputMonster.nextLine();
		userMonster.setCatchphrase(response);
		

		System.out.println(userMonster);

	}

	public boolean validInt(String sample)
	{
		//Declares and initializes a boolean variable to false
		boolean isValid = false;
		try
		{
			//tries to convert the text to an in
			Integer.parseInt(sample);
			isValid = true;

		}
		catch (NumberFormatException whoop)
		{
			System.out.println("A number please (decimals are not allowed)");
		}
		return isValid;
	}

	public boolean validDouble(String sample)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(sample);
			isValid = true;
		}
		catch (NumberFormatException whoop)
		{
			System.out.println("A number please (decimals are allowed)");
		}
		return isValid;
	}

}
