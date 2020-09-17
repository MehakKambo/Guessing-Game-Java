/*
 * Cpu Guessing Game
 * This program is to practice the use of if/else statements, and while loops to create a random 
 * number cpuGuessing game in which computer tries to cpuGuess the number in the range specified by the user.
 * It changes the bounds every time when the user inputs whether the cpu's guess was higher or lower.
 */
package CpuGuessGame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	static Scanner sc= new Scanner(System.in);
	static Random rand = new Random();
	static int cpuGuess, lowerBound, upperBound;
	static String ans;

	public static void main(String[] args) {
		checkValid();
		try {
			startGuessGame();
		} catch(IllegalArgumentException e) {
			System.out.println("You are a lier :(");
		}
	}

	/*
	 * This method is to prompt the user for the bounds to generate a random number
	 * cpuGuessed by the CPU in that range and checks whether the inputs are valid, 
	 * if not, prompt the user again.
	 */
	public  static void checkValid() {
		while(true) {
			System.out.print("Input the LowerBound(Inclusive): ");
			lowerBound = sc.nextInt();
			System.out.print("Input the UpperBound(Exclusive): ");
			upperBound = sc.nextInt();

			if((upperBound - lowerBound >= 0) && (lowerBound >=  0) && upperBound != 0) {					
				break;
			} else {
				System.out.println("\nBounds should be non negative and Upper bound cannot be 0.");
			}
		}
	}

	/*
	 * This method generates the number and asks the user how was cpuGuess, and then 
	 * proceeds according to user's input, if the user inputs something wrong, asks again.
	 * At last, it asks the user if they want to play again.
	 */
	public static void startGuessGame() {

		int tries = 0;
		cpuGuess = rand.nextInt(upperBound - lowerBound) + lowerBound;
		System.out.println("My Guess is : " + cpuGuess);	
		tries++;
		boolean correct = false;
		while (!correct) {
			System.out.println("Your Answer is (h= higher than you thought, l= lower than you thought, c= correct): ");
			String answer= sc.next();

			//The cpuGuess is lower than the users number
			if (answer.equalsIgnoreCase("l")) { 
				upperBound = cpuGuess;
				cpuGuess = rand.nextInt(upperBound - lowerBound) + lowerBound;
				System.out.println("My Guess is : " + cpuGuess);
				tries++;
			}

			//The cpuGuess is higher than the users number
			else if (answer.equalsIgnoreCase("h")) { 
				lowerBound = cpuGuess + 1;
				cpuGuess = rand.nextInt(upperBound - lowerBound) + lowerBound;
				System.out.println("My Guess is : " + cpuGuess);
				tries++;
			}

			//The cpuGuess is correct
			else if (answer.equalsIgnoreCase("c")) { 
				System.out.println("I am a genius computer!!");
				if(tries == 1) {
					System.out.println("It took me " + tries + " try.");
				} else {
					System.out.println("It took me " + tries + " tries.");
				}
				// For continue playing.
				System.out.println("Play Again? (Y for yes, N for no)");
				ans = sc.next();
				if(ans.equalsIgnoreCase("Y")){
					checkValid(); 
					startGuessGame();
				}
				else {
					System.out.println("Thanks for playing.");
					correct = true; 
				}
			}
			else {
				System.out.println("Please re-type."); 
			}
		}                                                 
	}
}




