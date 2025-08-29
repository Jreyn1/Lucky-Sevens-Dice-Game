public class RandomNumber
	{
		static int diceRollTotal;
		static int diceRoll1;
		static int diceRoll2;

		static void generateDiceRoll()
			{
				// Dice Roll Stuff
				diceRoll1 = ((int) (Math.random() * 6) + 1);
				diceRoll2 = ((int) (Math.random() * 6) + 1);
				diceRollTotal = diceRoll1 + diceRoll2;
				System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2 + " for a total of " + diceRollTotal);

				// Testing

//				System.out.println(diceRoll1);
//				System.out.println(diceRoll2);
//				System.out.println(diceRollTotal);
			}

	}
