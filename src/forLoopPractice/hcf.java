package forLoopPractice;

import java.util.Scanner;

public class hcf {

	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int dividend, divisior;
		int remainder, hcf =0 , lcm;
		
		System.out.println("Enter dividend:");
		dividend = input.nextInt();
		
		System.out.println("Enter divisior");
		divisior = input.nextInt();
		
		lcm = dividend * divisior; 
		
		do
		{
			remainder = dividend % divisior;
			
			if (remainder==0)
			{
				hcf = divisior;
            }
	    else
            {
                dividend = divisior;
                divisior = remainder;
	    }
            
        }
		while(remainder != 0);

		 
        System.out.println("HCF: " + hcf);
                     
        System.out.println("LCM:"+lcm/hcf);
        
        
		}
	}


