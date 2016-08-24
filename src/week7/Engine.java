package week7;

public class Engine
{
	//===============
	//Class Variables
	//===============
	private int intCylinders, intHorsePower;
	
	//============
	//Constructors
	//============
	public Engine()
	{
		this.intCylinders = 0;
		this.intHorsePower = 0;
	}
	public Engine( int intCylinders, int intHorsePower)
	{
		this.intCylinders = intCylinders;
		this.intHorsePower = intHorsePower;
	}
	
	//=========
	//Accessors
	//=========
	public int getCylinders()
	{
		return this.intCylinders;
	}
	public int getHorsePower()
	{
		return this.intHorsePower;
	}
	
	//========
	//Mutators
	//========
	public void setCylinders(int intInput)
	{
		this.intCylinders = intInput;
	}
	public void setHorsePower(int intInput)
	{
		this.intHorsePower = intInput;
	}
	
	//=======
	//Methods
	//=======
	public String toString()
	{
		String strOutput;
		strOutput = "**Engine Information**\n";
		strOutput += "  Cylinders: " + this.intCylinders + "\n";
		strOutput += "  Horse Power: " + this.intHorsePower + "\n";
		return strOutput;
	}
}
