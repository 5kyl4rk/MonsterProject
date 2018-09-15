package controller;

//our Monster "object"
import model.MarshmallowMonster;
//Scanner import
import java.util.Scanner;
//GUI import
import javax.swing.JOptionPane;

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
		//pop-up window, it will scale to fit the text
		JOptionPane.showMessageDialog(null, myMonster);
		//System.out.println(myMonster);

		setUpMonster();

	}

	private void setUpMonster()
	{
<<<<<<< HEAD
		System.out.println("What is the name of your monster?");
		String response = inputMonster.nextLine();
		userMonster.setName(response);
		System.out.println("Your monster's name is " + userMonster.getName());

		System.out.println("How many legs does it have?");
		response = inputMonster.next();
		while (!validDouble(response))
=======
		//---comment out sections are for console based responses---
		String inputResponse = JOptionPane.showInputDialog(null, "What is the name of your monster?");
		//String inputResponse = inputMonster.nextLine();
		userMonster.setName(inputResponse);
		//System.out.println("Your monster's name is " + userMonster.getName());
		JOptionPane.showMessageDialog(null, "Your monster's name is " + userMonster.getName());
		
		
		inputResponse = JOptionPane.showInputDialog(null, "How many legs does it have?");
		//response = inputMonster.next();
		while (!validDouble(inputResponse))
>>>>>>> 2e8f4a6b89b913f375e657f6b4020bd80fd14e12
		{
			//inputMonster.nextLine();
			//inputResponse.next();
			inputResponse = JOptionPane.showInputDialog(null, "How many legs does it have?");
		}
		userMonster.setLegCount(Double.parseDouble(inputResponse));
		//System.out.println("Your monster has " + userMonster.getLegCount() =" legs");
		JOptionPane.showMessageDialog(null, "Your monster has " + userMonster.getLegCount() +" legs");

		//System.out.println("How many eyes does it have?");
		inputResponse = JOptionPane.showInputDialog(null, "How many eyes does it have?");
		//inputResponse = inputMonster.next();
		while (!validInt(inputResponse))
		{
			//inputMonster.nextLine();
			//inputResponse = inputMonster.next();
			inputResponse = JOptionPane.showInputDialog(null, "How many eyes does it have?");
		}

		
		userMonster.setEyeCount(Integer.parseInt(inputResponse));
		//System.out.println("Your monster has " + userMonster.getEyeCount() + " eyes");
		JOptionPane.showMessageDialog(null,"Your monster has " + userMonster.getEyeCount() + " eyes");

		//inputMonster.nextLine();

		//System.out.println("Does your monster have a nose?");
		inputResponse = JOptionPane.showInputDialog(null, "Does your monster have a nose?");
		//Converts response into true/false by seeing if the reply is yes or no
		boolean valid = false;
		while (!valid)
		{
			//inputResponse = inputMonster.nextLine();
			if (inputResponse.toLowerCase().equals("yes") || inputResponse.toLowerCase().equals("true"))
			{
				userMonster.setHasNose(true);
				valid = true;
				//System.out.println("Your monster has a nose");
				JOptionPane.showMessageDialog(null,"Your monster has a nose");
			}
			else if (inputResponse.toLowerCase().equals("no") || inputResponse.toLowerCase().equals("false"))
			{
				userMonster.setHasNose(false);
				valid = true;
				//System.out.println("Your monster has no nose");
				JOptionPane.showMessageDialog(null,"Your monster has no nose");
			}
			else
			{
				//System.out.println("Please type either yes/no or true/false");
				JOptionPane.showMessageDialog(null,"Please type either yes/no or true/false");
			}
		}

		
		//System.out.println("How many arms does it have?");
		inputResponse = JOptionPane.showInputDialog(null, "How many arms does it have?");
		//inpuResponse = inputMonster.next();
		while (!validInt(inputResponse))
		{
			//inputMonster.nextLine();
			//inpuResponse = inputMonster.next();
			inputResponse = JOptionPane.showInputDialog(null,"How many arms does it have?");
		}
		userMonster.setArmCount(Integer.parseInt(inputResponse));
		//System.out.println("Your monster has " + userMonster.getArmCount() + " arms");
		JOptionPane.showMessageDialog(null,"Your monster has " + userMonster.getArmCount() + " arms");

		
		//inputMonster.nextLine();

		//System.out.println("Finally, what is your monster's favorite thing to say?");
		inputResponse = JOptionPane.showInputDialog(null,"Finally, what is your monster's favorite thing to say?");
		//inputResponse = inputMonster.nextLine();
		userMonster.setCatchphrase(inputResponse);
		

		//System.out.println(userMonster);
		JOptionPane.showMessageDialog(null, userMonster);

	}

	public boolean validInt(String maybeInt)
	{
		//Declares and initializes a boolean variable to false
		boolean isValid = false;
		try
		{
			//tries to convert the text to an in
			Integer.parseInt(maybeInt);
			isValid = true;

		}
		catch (NumberFormatException whoop)
		{
			JOptionPane.showMessageDialog(null, "A number please (decimals are not allowed)");
		}
		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException whoop)
		{
			JOptionPane.showMessageDialog(null,"A number please (decimals are allowed)");
		}
		return isValid;
	}

}
