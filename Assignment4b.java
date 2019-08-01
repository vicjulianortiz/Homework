/***********************************************************************
@Title:		OrtizVictorTexansPlayoffHopes
@Purpose:	To get familiar with single dimensional arrays
@Author:    Ortiz, Victor
@Date:   	11/10/17
@Version:	1.0
************************************************************************/

import java.util.Scanner;

public class OrtizVictorTexansPlayoffHopes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] texansScores = new int[6];
		int[] opponentsScores = new int[6];
		int counter = 0;

		for(int i = 0; i < 6; i++)
		{
			System.out.print("Texans scores: ");
			texansScores[i] = sc.nextInt();

			System.out.print("Opponents scores: ");
			opponentsScores[i] = sc.nextInt();

			if(texansScores[i] > opponentsScores[i])
			{
				counter++;
			}

			if(counter > 4)
			{
				counter = 4;
			}

			System.out.println("Texans need to win " + (4 - counter) + " more games out of " + (5 - i) + " to have a spot in playoffs.");
		}

		double texansWinAvg = setWinAvg(texansScores, opponentsScores);
		double texansLossAvg = setLossAvg(texansScores, opponentsScores);
		double oppWinAvg = setWinAvg(opponentsScores, texansScores);
		double oppLossAvg = setLossAvg(opponentsScores, texansScores);
		double winPercent = setWinPercent(texansScores, opponentsScores);

		playoffs(texansScores, opponentsScores);

		System.out.println("Winning percentage : " + winPercent + "%");
		System.out.println("Texans average score (win): " + texansWinAvg);
		System.out.println("Texans average score (loss): " + texansLossAvg);
		System.out.println("Opponents average score (win): " + oppWinAvg);
		System.out.println("Opponents average score (loss): " + oppLossAvg);

		printLowScore(texansScores);
		printLargestDef(texansScores, opponentsScores);

	}

		public static void playoffs(int[] a, int[] b)
		{
			int counter = 0;

			for( int i = 0; i < a.length; i++)
			{
				if(a[i] > b[i])
				{
					counter++;
				}
			}
			if(counter >= 4)
			{
				System.out.println("The texans made it to the plays offs!");
			}

		}

		public static double setWinPercent(int[] a, int[] b)
		{
			double counter = 0;

			for( int i = 0; i < a.length ; i++)
			{
				if(a[i] > b[i])
				{
					counter++;
				}
			}
			return (counter / a.length) * 100;
		}

		public static double setWinAvg(int[] a, int[] b)
		{
			double averageWin = 0;
			int counter = 0;

			for( int i = 0; i < a.length ; i++)
			{
				if(a[i] > b[i])
				{
				averageWin = averageWin + a[i];
				counter++;
				}
			}
			return averageWin / counter;
		}

		public static double setLossAvg(int[] a, int[] b)
		{
			double averageLoss = 0;
			int counter = 0;

			for( int i = 0; i < a.length ; i++)
			{
				if(a[i] < b[i])
				{
					averageLoss = averageLoss + a[i];
					counter++;
				}
			}
			return averageLoss / counter;
		}

		public static void printLowScore(int[] a)
		{
			int lowestScore = a[0];
			int lowestIndex = 0;

			for(int i = 1; i < a.length; i++)
			{
				if(a[i] < lowestScore)
				{
					lowestScore = a[i];
					lowestIndex = i + 1;
				}
			}
			System.out.println("Lowest texans score was " + lowestScore + " in game " + lowestIndex + ".");
		}

		public static void printLargestDef(int[] a, int[] b)
		{
			int[] scoreDiff = new int[6];
			int largestDef = 0, largestIndex = 0;

			for( int i = 0; i < scoreDiff.length; i++)
				{
					scoreDiff[i] = b[i] - a[i];
					if( scoreDiff[i] > largestDef)
					{
						largestDef = scoreDiff[i];
						largestIndex = i + 1;
					}
				}
			System.out.println("Largest deficit was " + largestDef + " and occurred in game " + largestIndex + "." );
		}
}