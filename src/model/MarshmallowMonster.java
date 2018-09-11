package model;

public class MarshmallowMonster
{
	//---[Declaration section]---
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//Default constructor
		//generally boring and not as helpful
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.hasNoses = hasNose;
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.armCount = arms;
	}
	public String toString()
	{
		String description = "";
		
		return description;
	}
}
