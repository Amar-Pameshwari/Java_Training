package Array;

public class TestArray {

	public static void main(String[] args) {
		
		//First Method
		int arrayOne[] = new int[10];
		
		arrayOne[0] = 20;
		arrayOne[1] = 13;
		arrayOne[2] = 17;
		arrayOne[3] = 19;
		arrayOne[4] = 3;
		arrayOne[5] = 9;
		
		System.out.println(arrayOne[4]);
		
		for(int i = 0; i<arrayOne.length; i++){
			
			
			System.out.println(arrayOne[i]);
		}
				
		// Second Method
		
		int arrayTwo[] = {2,3,4,5,6,1,8,9};
		
//		System.out.println(arrayTwo[4]);
		
		int min = arrayTwo[0];
		
		for(int i =0; i<arrayTwo.length; i++){
			if(min>arrayTwo[i]){
				min = arrayTwo[i];
		
		}
			
		}
		System.out.println("Minimum Value:"+min);
	}

}
