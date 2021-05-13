package forLoopPractice;

import java.util.Scanner;

public class adding2number {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		char choice;		
		
		do
		{
			System.out.println("Enter first number");
			num1 = scan.nextInt();
			
			System.out.println("Enter 2 number:");
			num2 = scan.nextInt();
			
			int sum = num1 + num2;
			System.out.println("Sum:"+sum);
			
			System.out.println("Do you want to continue:y/n?");
			choice = scan.next().charAt(0);
			
			System.out.println(" ");
		}
		while(choice == 'y' || choice == 'Y');

	}
}
