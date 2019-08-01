/*******************************************************************
@Title:	LastNameHurricaneCategories
@Purpose:	To get familiar with conditional statements in Java
@Author:    (your last first name)
@Date:   	(today’s date)
@Version:	1.0
*********************************************************************/
import java.util.Scanner;

public class OrtizVictorHurricaneCategories
{
	public static void main(String[] args)
	{
		int windSpeed;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the speed of the wind.");
		windSpeed = keyboard.nextInt();

		if(windSpeed >= 74 && windSpeed <= 95)
		{
			System.out.println("Category: 1 - Very dangerous winds will produce some danger.");
		}
		else if(windSpeed <= 110)
		{
			System.out.println("Category: 2 - Extremely dangerous winds will cause extensive damage.");
		}
		else if(windSpeed <= 129)
		{
		System.out.println("Category: 3 - Major: Devastating damage will occur.");
		}
		else if(windSpeed <= 156)
		{
		System.out.println("Category: 4 - Major: Catastrophic damage will occur");
		}
		else
		{
		System.out.println("Category: 5 - Major: Catastrophic damage will occur");
		}
	}
}

