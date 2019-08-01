/**
@Title:		OrtizVictorUserAuthentication
@Purpose:	To practice java File input and output.
@Author:    Ortiz, Victor
@Date:   	10/13/2017
@Version:	1.0
*/

import java.util.Scanner;
import java.io.*;

public class OrtizVictorUserAuthentication
{
	public static void main(String[] args)throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		FileInputStream fileByteStream = new FileInputStream("UserPassword.txt");
		Scanner inFS = new Scanner(fileByteStream);

		String username = inFS.next();
        String password = inFS.next();

		int killSwitch = 0;

		do
		{
			System.out.print("Welcome! Please enter User Name: ");
        	String usernameInput = keyboard.nextLine();


        	if (username.equals(usernameInput))
			{
				System.out.println("Welcome back " + username);
				killSwitch = -1;
			}
			else
			{
				System.out.println("Username does not exist.");
			}
		} while(killSwitch == 0);

		for(int i = 0; i < 3; i++)
		{
			System.out.println("Please enter User Password: ");
			String passwordInput = keyboard.nextLine();

			if (passwordInput.equals(password))
			{
				System.out.println("Congratulations! You have successfully logged in.");
				i = 3;
			}
			else
			{
				System.out.println("Password for Alice entered incorrectly!");

				if (i == 2)
				{
					System.out.println("You have entered incorrect password for 3 times, system is shutting down...");
				}
			}
		}
	}
}

