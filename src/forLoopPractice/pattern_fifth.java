package forLoopPractice;

public class pattern_fifth {

	
	public static void main(String[] args) {
	
int row =5;
		
		for(int i = 1; i <= row; i++)
		{
			for(int j = row; j>i; j--)
			{
				System.out.println(" ");
			}
			
			for(int k=1; k<=(i*2)-1; k++)
			{
				System.out.println(i+" ");
			}
			System.out.println( );
		}


	}

}
