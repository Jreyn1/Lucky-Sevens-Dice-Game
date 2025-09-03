public class DiceGamePlayer
	{

		public static void main(String[] args)
			{

				Communicate.instructions();

				while (Communicate.keepPlaying && Money.moneyTotal > 0)
					{
						Communicate.askToPlay();
						Money.pickBet();
						Money.rollDice();
						RandomNumber.generateDiceRoll();
						Money.winConditionAndBankRollStandard();
						RandomNumber.bonusRoundCounter();

						if (RandomNumber.roundCounter % 5 == 0 && Money.moneyTotal > 0)
							{
								Money.playBonusRound();
							}
					}
				System.out.println("Test");
			}
		
	}
