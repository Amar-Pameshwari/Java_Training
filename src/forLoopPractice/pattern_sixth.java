package forLoopPractice;

public class pattern_sixth {

	public static void main(String[] args) {

		
		int row = 6;
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= row-1; j++)
			{
				System.out.println(" ");
			}
			for(int k = i; k >= 1; k-- )
			{
				System.out.println(k+" ");
			}
			System.out.println();
		}

	}

}
