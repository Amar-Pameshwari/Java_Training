package forLoopPractice;

public class armStrongNumber {

	
	public static void main(String[] args) {
	
		
		int digit1, digit2, digit3;
		int temp;
		
		for(int number =1; number<=500; number++)
		{
			temp = number;
			digit1 = temp%10;
			temp = temp/10;
			
			digit2 = temp % 10;
			temp = temp /10;
			
			digit3 = temp % 10;
			
		if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 ==number)
		{
			System.out.println(number);
		}
		}

	}

}
