package forLoopPractice;

import java.util.Scanner;

public class count_findMaxMin {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int number;
		int positiveNumber = 0;
		int negativeNumber = 0;
		int zeroNumber =0;
		int minNumber = Integer.MAX_VALUE;
		int maxNumber = Integer.MIN_VALUE;
		char choice;
		
		do
		{
			System.out.println("Enter the number:");
			number = scan.nextInt();
			
			if(number>maxNumber)
			{
				maxNumber = number;
			}
			else if(number < minNumber)
			{
				minNumber = number;
			}
			
			if(number > 0)
			{
				positiveNumber++;
			}
			else if(number <0)
			{
				negativeNumber++;
			}
			else
			{
				zeroNumber++;	
			}
			
			System.out.println("Do you want to continue:y/n?");
			choice = scan.next().charAt(0);
		}
		while(choice == 'y' || choice == 'Y');
		
		System.out.println("Count Positive number:"+positiveNumber);
		System.out.println("Count Negative Number:"+negativeNumber);
		System.out.println("Count zero's"+zeroNumber);
		
		System.out.println("Max Number"+maxNumber);
		System.out.println("Min number"+minNumber);

	}

}
