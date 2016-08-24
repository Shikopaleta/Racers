package week7;

import javax.swing.JOptionPane;

public class MainClass
{
	public static void main(String[] args)
	{
		Racer racerList[] = new Racer[3];
		 
		racerList[0] = new HotRod();
		collectRacerInformation(racerList[0]);
		displayRacerInformation(racerList[0]);
		
		racerList[1] = new StreetTuner();
		collectRacerInformation(racerList[1]);
		displayRacerInformation(racerList[1]);
		
		racerList[2] = new StreetTuner();
		collectRacerInformation(racerList[2]);
		displayRacerInformation(racerList[2]);
		
	}
	
	//=======
	//Methods
	//=======
	//Racer methods
	/* Collects and sets the Racer's information */
	public static void collectRacerInformation(Racer racer)
	{
		racer.setName(getInput("Enter the Name"));
		racer.setSpeed(getIntegerInput("Enter the Speed"));
		racer.eng.setCylinders(getIntegerInput("Enter the number of Cylinders in the engine"));
		racer.eng.setHorsePower(getIntegerInput("Enter the Horse Power of the engine"));
		if(racer.getClass() == HotRod.class)
		{
			((HotRod)racer).setBlower(getBooleanInput("Blower on/off"));
		}
		if(racer.getClass() == StreetTuner.class)
		{
			((StreetTuner)racer).setNitrous(getBooleanInput("Nitrous on/off"));
		}
	}
	public static void displayRacerInformation(Racer racer)
	{
		displayDivider("Racer Information");
		System.out.println(racer.toString());
	}
	
	//get Inputs
	/* Returns a String */
	public static String getInput(String strTitle)
	{
		String strInput;
		strInput = JOptionPane.showInputDialog(strTitle + ":");
		return strInput;
	}
	/* Returns an Integer */
	public static int getIntegerInput(String strTitle)
	{
		String strInput;
		int intOutput = 0;
		boolean badInput = true;
		do
		{
			try
			{
				strInput = getInput(strTitle);
				intOutput = Integer.parseInt(strInput);
				badInput = false;
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid integer.", "Error", JOptionPane.PLAIN_MESSAGE);
			}
		} while (badInput);
		return intOutput;
	}
	/* Returns a Boolean */
	public static boolean getBooleanInput(String strTitle)
	{
		boolean blnOutput = false;
		String strBoolean;
		strBoolean = getInput(strTitle);
		if(strBoolean.equalsIgnoreCase("On"))
		{
			blnOutput = true;
		}
		else
		{
			blnOutput = false;
		}
		return blnOutput;
	}

	//Displayers
	public static void displayDivider (String strTitle)
	{
		System.out.println("**************** " + strTitle + " ****************");
	}
}
