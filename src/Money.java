import java.util.Scanner;

public class Money
	{
		static int moneyTotal = 1000;
		static int moneyBetted;

		static void pickBet()

			{
				boolean improperBet = true;

				while (improperBet)
					{
						System.out.println("Select an amount you'd like to bet");
						Scanner userIntInput = new Scanner(System.in);
						moneyBetted = userIntInput.nextInt();
						System.out.println("You bet " + moneyBetted + " dollars");

						// Foolproofing

						if (moneyBetted > moneyTotal)
							{
								System.out.println("You bet too high, bet again");
							}
						else if (moneyBetted <= 0)
							{
								System.out.println("You can't bet <= 0, bet again");
							}
						else
							{
								improperBet = false;
							}

					}

			}

		static void rollDice()
			{
				// Enter to Roll
				Scanner userEnterInput = new Scanner(System.in);
				System.out.println("Press enter to roll the dice");
				String doNotExist = userEnterInput.nextLine();
			}

		static void winConditionAndBankRollStandard()
			{
				if (RandomNumber.diceRollTotal == 7)
					{
						System.out.println("You win " + (moneyBetted * 1) + " dollars!");
						moneyTotal = moneyTotal + (moneyBetted * 1);
					}
				else
					{
						System.out.println("You lose " + moneyBetted + " dollars");
						moneyTotal = moneyTotal - moneyBetted;
					}
				System.out.println("You now have " + moneyTotal + " dollars");
				System.out.println("");

				if (moneyTotal == 0)
					{
						System.out.println("You lose");
					}

			}

		static void playBonusRound()
			{
				System.out.println("Guess what, you got a bonus round!!!");
				System.out.println("This round will play 2:1 odds, yippee");
				System.out.println("In addition, if you roll a 12 you will also win");
				System.out.println("This will not count towards your regular round counter");
				Communicate.askToPlay();
				Money.pickBet();
				Money.rollDice();
				RandomNumber.generateDiceRoll();
				Money.winConditionAndBankRollBonus();
			}

		static void winConditionAndBankRollBonus()
			{
				if (RandomNumber.diceRollTotal == 7 || RandomNumber.diceRollTotal == 12)
					{
						System.out.println("You win " + (moneyBetted * 2) + " dollars!");
						moneyTotal = moneyTotal + (moneyBetted * 2);
					}
				else
					{
						System.out.println("You lose " + moneyBetted + " dollars");
						moneyTotal = moneyTotal - moneyBetted;
					}
				System.out.println("You now have " + moneyTotal + " dollars");
				System.out.println("");

				if (moneyTotal == 0)
					{
						System.out.println("You lose");
					}
			}
	}
