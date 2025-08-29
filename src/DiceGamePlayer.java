import java.util.Scanner;
public class DiceGamePlayer
	{
		
		public static void main(String[] args)
			{
				Communicate.instructions();
				
				
				Money.pickBet();
				RandomNumber.generateDiceRoll();
				Money.winConditionAndBankRoll();
				
			}
		

	}
