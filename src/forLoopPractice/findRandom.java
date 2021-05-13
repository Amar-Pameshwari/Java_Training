package forLoopPractice;

import java.util.Scanner;

public class findRandom {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number,
		    guess,
		    tries =0;
		
		number = (int)(Math.random()*100)+1;
		
		System.out.println("Guess Random number");
		System.out.println(" ");
		
		do
		{
			System.out.println("Enter the guess number between 1 to 100 : ");
			guess = scan.nextInt();
			
			tries++;
			
			if(guess > number)
			{
				System.out.println("Too high, try again.");
			}
			else if(guess < number)
			{
				System.out.println("Too low, try again.");
			}
			else
			{
				System.out.println("Correct!"+","+ tries+"th time you got answer" );
			}
		}
		while(guess != number);
	}

}
