package week7;

import java.util.Random;

public class HotRod extends Racer
{
	//===============
	//Class Variables
	//===============
	private boolean blnBlower;
	
	//============
	//Constructors
	//============
	public HotRod()
	{
		super();
		this.blnBlower = false; 
	}
	public HotRod(String strName, int intSpeed, Engine engine, boolean blnBlower)
	{
		super(strName, intSpeed, engine);
		this.blnBlower = blnBlower;
	}
	
	//=========
	//Accessors
	//=========
	public boolean getBlower()
	{
		return this.blnBlower;
	}
	
	//========
	//Mutators
	//========
	public void setBlower(boolean blnInput)
	{
		this.blnBlower = blnInput;
	}
	
	//=======
	//Methods
	//=======
	public boolean isDead()
	{
		Random rnd = new Random();
		boolean blnDead = false;
		
		if(getSpeed() > 50 && rnd.nextDouble() > 0.6)
		{
			if(eng.getHorsePower() < 300 && this.blnBlower == true)
			{
				blnDead = false;
			}
			else 
			{
				blnDead = true;
			}
		}
		else
		{
			if(getSpeed() > 100 && rnd.nextDouble() > 0.4)
			{
				if(eng.getHorsePower() >= 300 && this.blnBlower == true)
				{
					blnDead = true;
				}
				else 
				{
					blnDead = false;
				}
			}
			else
			{
				blnDead = false;
			}
		}
		
		return blnDead;
	}
	public String toString()
	{
		String strOutput, strIsDead;
		if(isDead())
		{
			strIsDead = "Yes";
		} else {
			strIsDead = "No";
		}
		strOutput = super.toString();
		strOutput += "Blower: " + this.blnBlower + "\n\n";
		strOutput += "Is the Racer dead? " + strIsDead + "\n";
		return strOutput;		
	}
}
