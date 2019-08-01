/*******************************************************************
@Title:     SavingsAccount
@Purpose:   Assignment for Chapter 6 Programming Challenge #13
@Author:    Ortiz, Victor
@Date:      07/16/2018
********************************************************************/

public class SavingsAccount
{
	private double balance;
	private double interestEarned;

	public SavingsAccount(double bal)
	{
		balance = bal;
	}

	public double getBalance()
	{
		return balance;
	}

	public double getInterestEarned()
	{
		return interestEarned;
	}

	public void addDeposit(double dep)
	{
		balance += dep;
	}

	public void addMonthlyInterest(double yearlyInt)
	{
		double monthlyInterest = (yearlyInt/100) / 12;
		interestEarned = monthlyInterest * balance;
		balance = interestEarned + balance;
	}

	public void subtractWithdrawal(double with)
	{
		balance -= with;
	}
}