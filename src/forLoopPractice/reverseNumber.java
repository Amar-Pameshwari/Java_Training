package forLoopPractice;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		
		int reverse=0;
		
		System.out.println("Enter the number:");
		num = input.nextInt();
		
		int temp = num;
		int reminder = 0;
		
		while(temp>0)
		{
			reminder = temp%10;
			reverse = reverse*10+reminder;
			temp /=10;
		}
        System.out.println("Reverse of " + num + " is " + reverse);
	}

}
