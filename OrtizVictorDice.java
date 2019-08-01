import java.util.Scanner;
import java.util.Random;

public class OrtizVictorDice
{


	public static void main(String[] args)
	{
	}

	public static String computerChoice(){
		Random randomNum = new Random();
		int computerNumber = randomNum.nextInt(4);
		String computerColor = " ";

		if (computerNumber == 0)
			computerColor = "red";
		else if (computerNumber == 1)
			computerColor = "green";
		else if (computerNumber == 2)
			computerColor = "blue";
		else
			computerColor = "orange";

		return computerColor;
	}

	public static String userChoice()
	{
	}

	public static boolean isValidChoice(String computerGuess, String userGuess)
	{
	}

	public static void determineWinner(String computer, String user)
	{
	}

}