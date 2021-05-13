package forLoopPractice;

import java.util.Scanner;

public class powerNumber {

	public static void main(String[] args) {

		Scanner input1 =new Scanner(System.in);
		int base;
		
		System.out.println("Enter the base:");
		base = input1.nextInt();
		
		Scanner input2 =new Scanner(System.in);
		int power;
		
		int result=1;
		
		System.out.println("Enter the Power:");
		power = input1.nextInt();

		for(int i = 1; i<=power; i++)
		{
			result = result*power;
	
		}
		
		System.out.println(result);
	}
	

}
