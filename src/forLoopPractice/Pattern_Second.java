package forLoopPractice;

public class Pattern_Second {

	
	public static void main(String[] args) {
		
		int column = 5;
		for(int i = 1; i<=column; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.println("*");
			}
			System.out.println(i+" ");
		}

	}

}
