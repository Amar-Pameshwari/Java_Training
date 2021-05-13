package forLoopPractice;

import java.util.Scanner;

public class primeNumber {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter positive number:");
		
		number = input.nextInt();
		
		boolean flag = true;
		
		
		for(int i=2; i<=number; i++)
		{
			if(number % 2 ==0)
			{
				flag = false;
				break;
			}
		}
		if(flag && number >1)
		{
			System.out.println(number + "is prime no");
		}
		else
		{
			System.out.println(number +"is not prime no");
		}

	}

}
