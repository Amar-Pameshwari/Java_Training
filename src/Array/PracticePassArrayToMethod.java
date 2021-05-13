package Array;

public class PracticePassArrayToMethod {

	//First method to find min value
	public void finMinValue(int arrayOne[]){
		
		int min = arrayOne[0];
		
		for(int i=0; i<arrayOne.length; i++){
			if(min>arrayOne[i]){
				min = arrayOne[i];
			}
		}
		System.out.println(min);
	}
	
	public static int[] findMinValue(){
		return new int[]{10,20,30,5,2,6,0};
	}
	
	public static void main(String[] args) {
	

		PracticePassArrayToMethod pass = new PracticePassArrayToMethod();
		
		int array[] = {3,4,5,1,2,6,7,8};
		
		pass.finMinValue(array);
		
		int arrayTwo[]=pass.findMinValue();
		int min1 = arrayTwo[0];
		for(int j=0; j<arrayTwo.length;j++){
			if(min1>arrayTwo[j]){
				min1=arrayTwo[j];
			}
		}
		System.out.println(min1);
		
	}

}
