package forLoopPractice;

public class Pattern_third {

	
	public static void main(String[] args) {
		
		int row =5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>1;j--)
			{
				System.out.println("");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.println("* ");
			}
			System.out.println( );
		}

	}

}
