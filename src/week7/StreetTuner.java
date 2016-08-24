package week7;

import java.util.Random;

public class StreetTuner extends Racer
{
	//===============
	//Class Variables
	//===============
	private boolean blnNitrous;
	
	//============
	//Constructors
	//============
	public StreetTuner()
	{
		super();
		this.blnNitrous = false;
	}
	public StreetTuner(String strName, int intSpeed, Engine engine, boolean blnNitrous)
	{
		super(strName, intSpeed, engine);
		this.blnNitrous = blnNitrous;
	}
	
	//=========
	//Accessors
	//=========
	public boolean getNitrous()
	{
		return this.blnNitrous;
	}
	
	//========
	//Mutators
	//========
	public void setNitrous(boolean blnInput)
	{
		this.blnNitrous = blnInput;
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
			if(eng.getHorsePower() < 300 && this.blnNitrous == true)
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
				if(eng.getHorsePower() >= 300 && this.blnNitrous == true)
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
		strOutput += "Nitrous: " + this.blnNitrous + "\n\n";
		strOutput += "Is the Racer dead? " + strIsDead + "\n";
		return strOutput;		
	}
}
