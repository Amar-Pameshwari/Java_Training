package forLoopPractice;

import java.util.Scanner;

public class evenOdd {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int number,even =0,odd=0;
		char choice;
		
		
		
		do
		{
			System.out.println("Enter the number:");
			number = input.nextInt();
			
			if(number %2 ==0)
			{
				even+=number;
			}
			else
			{
				odd+=number;
			}
			System.out.println("Do you want to continue");
			choice= input.next().charAt(0);
		}
		while(choice=='y' || choice == 'Y');
		{
			System.out.println("Sum of even numbers: " + even);
	        System.out.println("Sum of odd numbers: " + odd);
		}

	}

}
