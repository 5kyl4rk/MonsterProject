package model;

public class MarshmallowMonster
{
	// ---[Declaration section]---
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	private String catchphrase;

	public MarshmallowMonster()
	{
		// Default constructor
		// generally boring and not as helpful
	}

	public MarshmallowMonster(String name)
	{
		this.name = name;
	}

	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms, String catchphrase)
	{
		this.hasNoses = hasNose;
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.catchphrase = catchphrase;
	}

	public String toString()
	{
		String nose = "";
		if (hasNoses)
		{
			nose ="a nose";
		} else {
			nose = "no nose";
		}
		String description = "This Monster is named " + name + " and it has " + legCount + " legs, " + eyeCount + " eyes, " + armCount + " arms " + "and it has " + nose
				+".  It's favorite thing to say is: " + "\"" + catchphrase + "\"";

		return description;
	}
}
