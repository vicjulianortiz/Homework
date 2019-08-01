/***********************************************************************
@Title:		OrtizVictorRestaurantBill
@Purpose:	To get familiar with simple calculations and comparison in Java
@Author:    Ortiz, Victor
@Date:   	09/19/2017
@Version:	1.0
************************************************************************/

import java.util.Scanner;

public class OrtizVictorRestaurantBill
{
    public static void main(String[] args)
    {
		int numberOfDiners;
		double mealCost, tipRate, billTotal, tipTotal, taxTotal;
		final double LARGEPARTYTIPRATE = 0.25;
		final double TAXRATE = 0.0625;

		Scanner keyboard = new Scanner(System.in);

        System.out.println("How many people dined today?");
        numberOfDiners = keyboard.nextInt();

        System.out.print("Now, please enter the total of your meal: $");
        mealCost = keyboard.nextDouble();

        taxTotal = mealCost * TAXRATE;

        if (numberOfDiners < 6)
        {
			System.out.println("Enter the tip rate percentage you wish to give:\n(10% for poor service, 15% for adequate service, 20% for good service)");
			tipRate = keyboard.nextDouble();
			tipRate = tipRate / 100;
        	tipTotal = tipRate * (mealCost + taxTotal);

			billTotal = mealCost + taxTotal + tipTotal;
        	System.out.printf("Your meal charge is $%.2f, tax amount is $%.2f, tip total is $%.2f, and your bill total is $%.2f.\n", mealCost, taxTotal, tipTotal, billTotal);
		}
		else
		{
			System.out.println("Please note since you had 6 or more diners a 25% tip rate is required.");
			tipTotal = LARGEPARTYTIPRATE * (mealCost + taxTotal);
			billTotal = (mealCost + taxTotal) + LARGEPARTYTIPRATE * (mealCost + taxTotal);
			System.out.printf("Your meal charge is $%.2f, tax amount is $%.2f, tip total is $%.2f, and your bill total is $%.2f.\n", mealCost, taxTotal, tipTotal, billTotal);
		}
   }
}

