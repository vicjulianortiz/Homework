	/**
	@Title:		LastNameFirstNameESP
	@Purpose:	To practice method calls and loop structure.
	@Author:    	(your last first name)
	@Date:   	(today’s date)
	@Version:	1.0
	*/
import java.util.Scanner;
import java.util.Random;

public class OrtizVictorESP
{


	public static void main(String[] args)
	{


		for ( int i = 0; i < 10; i++){
		String computerGuess = computerChoice();
		System.out.println(computerGuess);
		String userGuess = userChoice();
		determineWinner(computerGuess, userGuess);


	}

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

	public static String userChoice(){
		Scanner sc = new Scanner(System.in);
		System.out.println("The computer has selected a color from these options: red, green, blue, organge. Guess which one has been selected.");
		String userWord = sc.nextLine();
		return userWord;
	}

	public static boolean isValidChoice(String computerGuess, String userGuess){
		if (computerGuess.equalsIgnoreCase("RED") || computerGuess.equalsIgnoreCase("GREEN") || computerGuess.equalsIgnoreCase("BLUE")||computerGuess.equalsIgnoreCase("ORANGE"))
			return true;
		else
			return false;
	}

	public static void determineWinner(String computer, String user){
		int userCounter;
		userCounter += userCounter;

		if (computer.equalsIgnoreCase(user))
		{
			System.out.println("You win");
			userCounter++;
			System.out.println(userCounter);
		}
		else
		{
			System.out.println("You lose");
		}
	}

}
