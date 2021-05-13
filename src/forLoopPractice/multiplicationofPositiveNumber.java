package forLoopPractice;

import java.util.Scanner;

public class multiplicationofPositiveNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Enter positive number: ");
		num = input.nextInt();
			
		System.out.println("Mutiplication of number "+num+"are");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
	}

}
