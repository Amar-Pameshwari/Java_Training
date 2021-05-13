package forLoopPractice;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		int num ;
		
		
		System.out.println("Enter factorial number:");
		num = input.nextInt();
		
		int sum = 1;
		
		for(int i=1;i<=num;i++)
		{
			sum=sum*i;
			
		}
		System.out.println(sum);
	}

}
