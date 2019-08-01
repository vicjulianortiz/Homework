/*******************************************************************
@Title:     SavingsAccountDemo
@Purpose:   Assignment for Chapter 6 Programming Challenge #13
@Author:    Ortiz, Victor
@Date:      07/16/2018
********************************************************************/

import java.util.Scanner;
import java.io.*;

public class SavingsAccountDemo
{
	public static void main(String[] args)throws IOException
	{
		String line, line2;

		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new FileReader("Deposits.txt"));
		BufferedReader in2 = new BufferedReader(new FileReader("Withdrawals.txt"));

		SavingsAccount accountBalance = new SavingsAccount(500.00);

		while((line = in.readLine()) != null)
		{
			 double value = Double.parseDouble(line);
			 accountBalance.addDeposit(value);
		}
		in.close();

		while((line2 = in2.readLine()) != null)
		{
			 double value = Double.parseDouble(line2);
			 accountBalance.subtractWithdrawal(value);
		}
		in2.close();

		System.out.println("What is your yearly interest rate? Please enter the percentage not the decimal.\n(If your interest is 0.05/5% please jus enter '5')");
		double yearlyInterest = sc.nextDouble();
		accountBalance.addMonthlyInterest(yearlyInterest);

		System.out.println("Total balance is: $" + accountBalance.getBalance() + " \nTotal balance earned: $" + accountBalance.getInterestEarned());

	}
}