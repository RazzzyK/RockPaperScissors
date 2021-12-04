package game;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		System.out.println("\t** WELCOME TO ROCK PAPER SCISSORS! **");
		
		do {
		
			System.out.println("\n-- Player 1: Please choose from the following --");
			System.out.println("\n\t[1] Rock");
			System.out.println("\t[2] Paper");
			System.out.println("\t[3] Scissors");
			System.out.print("\tPlayer 1 Input: ");
			
			int player1 = scan.nextInt();
	
			System.out.println("\n-- Player 2: Please choose from the following --");
			System.out.println("\n\t[1] Rock");
			System.out.println("\t[2] Paper");
			System.out.println("\t[3] Scissors");
			System.out.print("\tPlayer 2 Input: ");
			
			int player2 = scan.nextInt();
			
			rps(player1, player2);
			
			System.out.println("\nPlease enter -99 to quit or any int to play again!");
			System.out.print("Play Again? Input: ");
			input = scan.nextInt();
			
		}while(input != -99);
		
		System.out.println("\n\t ***** THANKS FOR PLAYING! *****");
	}
	
	public static void rps(int player1, int player2) {
		
		
		if(player1 == player2) {
			System.out.println("\n\tRESULTS: TIE");
		}
		else if(player1 == 1 && (player2 == 2))   {
			System.out.println("\n\tRESULTS: PLAYER 2 WINS!");
		}
		else if(player1== 1 && player2 == 3)   {
			System.out.println("\n\tRESULTS: PLAYER 1 WINS!");
		}
		else if (player1 == 3 && player2 == 2)   {
			System.out.println("\n\tRESULTS: PLAYER 1 WINS!");
		}
		else if(player1 == 3 && player2 == 1) {
			System.out.println("\n\tRESULTS: PLAYER 2 WINS!");
		}
		else if (player1 == 2 && player2 == 1)   {
			System.out.println("\n\tRESULTS: PLAYER 1 WINS!");
		}
		else if(player1 == 2 && player2 == 3) {
			System.out.println("\n\tRESULTS: PLAYER 2 WINS!");
		}
	}
}
