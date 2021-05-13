package forLoopPractice;

import java.util.Scanner;

public class fibonassiNumber {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int firstTerm =0,
		    secondTerm =1,
		    thirdTerm,
		    number;
		
		System.out.println("Enter the limit:  ");
		number = scan.nextInt();
		
		System.out.println(firstTerm+" "+secondTerm+" ");
		
		for(int i=0; i<=number; i++)
		{
			thirdTerm = firstTerm+secondTerm;
			System.out.println(thirdTerm+" ");
			firstTerm=secondTerm;
			secondTerm=	thirdTerm;
		}
		
		
	
	}

}
