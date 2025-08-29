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
						System.out.println("You bet " + moneyBetted + " dollars, you now have " + (moneyTotal - moneyBetted) + " dollars.");

						// Foolproofing

						if (moneyBetted > moneyTotal)
							{
								System.out.println("You bet too high, bet again");
							} else if (moneyBetted <= 0)
							{
								System.out.println("You can't bet <= 0, bet again");
							} else
							{
								improperBet = false;
							}

					}

				// Enter to Roll
				Scanner userEnterInput = new Scanner(System.in);
				System.out.println("Press enter to roll the dice");
				String doNotExist = userEnterInput.nextLine();

			}

		static void winConditionAndBankRoll()
			{
				if (RandomNumber.diceRollTotal == 7)
					{
						System.out.println("You win " + (moneyBetted * 2) + " dollars!");
					} else
					{
						System.out.println("You lose " + moneyBetted + " dollars");
					}

			}

	}
