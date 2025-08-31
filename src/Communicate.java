import java.util.Scanner;

public class Communicate
	{
		static boolean keepPlaying = true;

		static void instructions()
			{
				System.out.println("Welcome to Lucky Sevens, where you most always lose");
				System.out.println("If the sum of the two dice you roll is 7, you win");
				System.out.println("Anything else, you lose");
				System.out.println("");
				System.out.println("The casino has given you 1000 dollars to start off with");
				System.out.println("This game pays 1:1");
				System.out.println("Every 5 rounds, you will have a bonus round where the game will pay you 2:1 odds");
				System.out.println("Let's begin");
				System.out.println("");
			}

		static void askToPlay()
			{
				// boolean
				boolean correctGuess = false;

				while (correctGuess == false)
					{
						Scanner userIntInput = new Scanner(System.in);
						System.out.println("Would you like to play?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						int playChoice = userIntInput.nextInt();

						// Foolproofing & Conditions
						if (playChoice != 1 && playChoice != 2)
							{
								System.out.println("Wrong guessing format, ask again");
								correctGuess = false;
							}
						else if (playChoice == 1)
							{
								correctGuess = true;
								keepPlaying = true;
							}
						else if (playChoice == 2)
							{
								correctGuess = true;
								keepPlaying = false;
							}

					}
				if (keepPlaying == false)
					{
						System.out.println("Ok, thanks for playing");
						System.exit(0);
					}

			}
	}
