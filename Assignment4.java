import java.util.Scanner;

public class Assignment4
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		int[] texansScores = new int[6];
		int[] opponentsScores = new int[6];
		int[] texansWinCounter = new int[6];
		int[] scoreDifference = new int[6];
		int homeCounter = 0;
		int awayCounter = 0;
		int gamesLeft = 6;
		int gamesNeededToWin = 4;
		int largestDeficit = 0;
		int largestDeficitIndex = 0;

		/**

		for(int i = 0; i < 6; i++)
		{
			System.out.print("Texans scores: ");
			texansScores[i] = sc.nextInt();

			System.out.print("Opponents scores: ");;
			opponentsScores[i] = sc.nextInt();

			if(texansScores[i] > opponentsScores[i])
			{
				homeCounter++;
				gamesNeededToWin--;
				texansWinCounter[i] = 1;
			}
			else
			{
				awayCounter++;
				texansWinCounter[i] = 0;
			}
			gamesLeft--;

			if(gamesNeededToWin < 0)
				gamesNeededToWin = 0;

			System.out.println("Texans need " + gamesNeededToWin + " more games out of " + gamesLeft + " to have a spot in the playoffs.");
		}

		if(homeCounter >= 4)
			System.out.println("The texas have made it to the play offs.");

		System.out.println("The winning percentage is : " + (homeCounter /(double) 6) * 100 + "%");

		double averageWinScore = 0;

		**/



		for( int i = 0; i < texansScores.length ; i++)
		{
			if(texansWinCounter[i] > 0)
			averageWinScore = averageWinScore + texansScores[i];

			if(i == (texansScores.length - 1))
			averageWinScore = averageWinScore / homeCounter;
		}

		System.out.println("Texans average score (win): " + averageWinScore);

		double averageLossScore = 0;

		for( int i = 0; i < texansScores.length ; i++)
		{

			if(texansWinCounter[i] == 0)
			averageLossScore = averageLossScore + texansScores[i];

			if(i == (texansScores.length - 1))
			averageLossScore = averageLossScore / (6-homeCounter);
		}

		System.out.println("Texans average score (loss): " + averageLossScore);

		double averageWinScore2 = 0;

		for( int i = 0; i < opponentsScores.length ; i++)
		{
			if(texansWinCounter[i] == 0)
			averageWinScore2 = averageWinScore2 + opponentsScores[i];

			if(i == (texansScores.length - 1))
			averageWinScore2 = averageWinScore2 / awayCounter;
		}

		System.out.println("Opponents average score (win): " + averageWinScore2);

		double averageLossScore2 = 0;

		for( int i = 0; i < opponentsScores.length ; i++)
		{
			if(texansWinCounter[i] > 0)
			averageLossScore2 = averageLossScore2 + opponentsScores[i];

			if(i == (texansScores.length - 1))
			averageLossScore2 = averageLossScore2 / (6-awayCounter);
		}

		System.out.println("Opponents average score (loss): " + averageLossScore2);

		/**

		int lowestScore = texansScores[0];
		int lowestScoreIndex = 0;

		for(int i = 1; i < texansScores.length; i++)
		{
			if(texansScores[i] < lowestScore)
			{
			lowestScore = texansScores[i];
			lowestScoreIndex = i + 1;
			}
		}

		System.out.println("Lowest Houston Texans score was " + lowestScore + " in game " + lowestScoreIndex);

		for( int i = 0; i < scoreDifference.length; i++)
		{
			scoreDifference[i] = opponentsScores[i] - texansScores[i];
		}

		for(int i = 0; i < scoreDifference.length; i++)
		{
			if( scoreDifference[i] > largestDeficit)
			largestDeficit = scoreDifference[i];
			largestDeficitIndex = i + 1;
		}

		System.out.println("Largest deficit was " + largestDeficit + " and occurred in game " + largestDeficitIndex);
		**/

	}
}
