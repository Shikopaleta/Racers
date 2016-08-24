package week7;

public abstract class Racer
{
	//===============
	//Class Variables
	//===============
	private String strName;
	private int intSpeed;
	public Engine eng;
	
	//============
	//Constructors
	//============
	public Racer()
	{
		this.strName = "Unknown";
		this.intSpeed = 0;
		this.eng = new Engine();
	}
	public Racer(String strName, int intSpeed, Engine eng)
	{
		this.strName = strName;
		this.intSpeed = intSpeed;
		this.eng = eng;
	}
	
	//=========
	//Accessors
	//=========
	public String getName()
	{
		return this.strName;
	}
	public int getSpeed()
	{
		return this.intSpeed;
	}
	
	//========
	//Mutators
	//========
	public void setName(String strInput)
	{
		this.strName = strInput;
	}
	public void setSpeed(int intInput)
	{
		this.intSpeed = intInput;
	}
	
	//=======
	//Methods
	//=======
	public abstract boolean isDead();
	public String toString()
	{
		String strOutput;
		strOutput = "Name: " + this.strName + "\n";
		strOutput += "Speed: " + this.intSpeed + "\n";
		strOutput += eng.toString();
		return strOutput;
	}
	
}
