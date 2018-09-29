package controller;

//our Monster "object"
import model.MarshmallowMonster;
//Scanner import
import java.util.Scanner;
//GUI import
import javax.swing.JOptionPane;

public class MonsterController {
	// Data member section
	// Declaration section
	Scanner inputMonster = new Scanner(System.in);
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;

	// Constructors initialize data members
	public MonsterController() {
		myMonster = new MarshmallowMonster("Tizmo", 6.5, 3, true, 4, "no u");
		userMonster = new MarshmallowMonster();
	}

	public void start() {
		// pop-up window, it will scale to fit the text
		JOptionPane.showMessageDialog(null, myMonster);
		// System.out.println(myMonster);
		//setUpConsoleMonster();

		setUpGUIMonster();

	}

	private void setUpGUIMonster() {
		boolean isSpider = false;
		String inputResponse = JOptionPane.showInputDialog(null, "What is the name of your monster?");
		userMonster.setName(inputResponse);
		JOptionPane.showMessageDialog(null, "Your monster's name is " + userMonster.getName());

		inputResponse = JOptionPane.showInputDialog(null, "How many legs does it have?");
		while (!validDouble(inputResponse)) {
			inputResponse = JOptionPane.showInputDialog(null, "How many legs does it have?");
		}

		userMonster.setLegCount(Double.parseDouble(inputResponse));
		if (userMonster.getLegCount() == 4) {
			isSpider = true;
		}
		JOptionPane.showMessageDialog(null, "Your monster has " + userMonster.getLegCount() + " legs");

		inputResponse = JOptionPane.showInputDialog(null, "How many eyes does it have?");
		while (!validInt(inputResponse)) {
			inputResponse = JOptionPane.showInputDialog(null, "How many eyes does it have?");
		}

		userMonster.setEyeCount(Integer.parseInt(inputResponse));
		if (userMonster.getEyeCount() != 8) {
			isSpider = false;
		}
		JOptionPane.showMessageDialog(null, "Your monster has " + userMonster.getEyeCount() + " eyes");

		inputResponse = JOptionPane.showInputDialog(null, "Does your monster have a nose?");
		boolean valid = false;
		// Converts response into true/false by seeing if the reply is yes or no
		while (!valid) {
			if (inputResponse.toLowerCase().equals("yes") || inputResponse.toLowerCase().equals("true")) {
				userMonster.setHasNose(true);
				valid = true;
				JOptionPane.showMessageDialog(null, "Your monster has a nose");
				isSpider = false;

			} else if (inputResponse.toLowerCase().equals("no") || inputResponse.toLowerCase().equals("false")) {
				userMonster.setHasNose(false);
				valid = true;
				JOptionPane.showMessageDialog(null, "Your monster has no nose");
				JOptionPane.showMessageDialog(null, "I guess he can never stop and smell the roses then");
			} else {
				JOptionPane.showMessageDialog(null, "Please type either yes/no or true/false");
				inputResponse = JOptionPane.showInputDialog(null, "Does your monster have a nose?");
			}
		}

		inputResponse = JOptionPane.showInputDialog(null, "How many arms does it have?");
		while (!validInt(inputResponse)) {
			inputResponse = JOptionPane.showInputDialog(null, "How many arms does it have?");
		}
		userMonster.setArmCount(Integer.parseInt(inputResponse));
		if (userMonster.getArmCount() != 4) {
			isSpider = false;
		}
		JOptionPane.showMessageDialog(null, "Your monster has " + userMonster.getArmCount() + " arms");

		inputResponse = JOptionPane.showInputDialog(null, "Finally, what is your monster's favorite thing to say?");
		userMonster.setCatchphrase(inputResponse);
		if (userMonster.getCatchphrase().toLowerCase().equals("gotta go fast")) {
			JOptionPane.showMessageDialog(null, "Gotta go fast");
			JOptionPane.showMessageDialog(null, "Gotta go fast!");
			JOptionPane.showMessageDialog(null, "Gotta go faster");
			JOptionPane.showMessageDialog(null, "Faster!");
			JOptionPane.showMessageDialog(null, "FASTER!");
			JOptionPane.showMessageDialog(null, "FASTER!!!");

		} else if (userMonster.getCatchphrase().toLowerCase().equals("owo")) {
			userMonster.setCatchphrase(
					"I'm a lonely depressed man who spends his time on internet chat rooms and is sexual attracted to anthropromorphic animals");
		}
		if (isSpider) {
			JOptionPane.showMessageDialog(null, "Your monster is literally just a spider");
			JOptionPane.showMessageDialog(null, "  / _ \\\n" + " \\_\\(_)/_/\n" + " _//\"\\\\_\n" + "   /   \\");
		} else {
			JOptionPane.showMessageDialog(null, userMonster);
		}

	}

	// --- console based responses---
	private void setUpConsoleMonster() {
			System.out.println("What is the name of your monster?");
			String inputResponse = inputMonster.nextLine();
			userMonster.setName(inputResponse);
			
			System.out.println("Your monster's name is " + userMonster.getName());
				
				
			System.out.println("How many legs does it have?");
				
			inputResponse = inputMonster.next();
			while (!validDouble(inputResponse))
				{
					inputMonster.nextLine();
					inputResponse = inputMonster.next();
					
				}
			userMonster.setLegCount(Double.parseDouble(inputResponse));
			System.out.println("Your monster has " + userMonster.getLegCount()+" legs");
				
			System.out.println("How many eyes does it have?");
				
			inputResponse = inputMonster.next();
			while (!validInt(inputResponse))
				{
					inputMonster.nextLine();
					inputResponse = inputMonster.next();
					
				}

				
			userMonster.setEyeCount(Integer.parseInt(inputResponse));
			System.out.println("Your monster has " + userMonster.getEyeCount() + " eyes");
				

			inputMonster.nextLine();

			System.out.println("Does your monster have a nose?");
				
			//Converts response into true/false by seeing if the reply is yes or no
			boolean valid = false;
			while (!valid)
				{
				inputResponse = inputMonster.nextLine();
				if (inputResponse.toLowerCase().equals("yes") || inputResponse.toLowerCase().equals("true"))
				{
					userMonster.setHasNose(true);
					valid = true;
					System.out.println("Your monster has a nose");
						
				}
				else if (inputResponse.toLowerCase().equals("no") || inputResponse.toLowerCase().equals("false"))
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
				
			inputResponse = inputMonster.next();
			while (!validInt(inputResponse))
				{
					inputMonster.nextLine();
					inputResponse = inputMonster.next();
					
				}
			userMonster.setArmCount(Integer.parseInt(inputResponse));
			System.out.println("Your monster has " + userMonster.getArmCount() + " arms");
				

				
			inputMonster.nextLine();

			System.out.println("Finally, what is your monster's favorite thing to say?");
			inputResponse = inputMonster.nextLine();
			userMonster.setCatchphrase(inputResponse);
				

			System.out.println(userMonster);
		}

	public boolean validInt(String maybeInt) {
		// Declares and initializes a boolean variable to false
		boolean isValid = false;
		try {
			// tries to convert the text to an in
			Integer.parseInt(maybeInt);
			isValid = true;

		} catch (NumberFormatException whoop) {
			JOptionPane.showMessageDialog(null, "A number please (decimals are not allowed)");
		}
		return isValid;
	}

	public boolean validDouble(String maybeDouble) {
		boolean isValid = false;
		try {
			Double.parseDouble(maybeDouble);
			isValid = true;
		} catch (NumberFormatException whoop) {
			JOptionPane.showMessageDialog(null, "A number please (decimals are allowed)");
		}
		return isValid;
	}

}
