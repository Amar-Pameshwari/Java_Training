package Array;

public class PassArrayToMethod {

	public void findMin(int arrayOne[]){
		
		int min = arrayOne[0];
		
		for(int i =0; i<arrayOne.length; i++){
			
			if(min>arrayOne[i]){
				min = arrayOne[i];
			}
		}
		System.out.println("Minimum Value:"+min);
	}
	
	public static int[] getArray(){
		return new int[] {12,13,14,2,5,5};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassArrayToMethod pass = new PassArrayToMethod();
		
		int arrayTest[] = {2,3,4,6,1,9,10};
		
		pass.findMin(arrayTest);
		
		int arrayThree[] = pass.getArray();
		
		int max = arrayThree[0];
		
		for(int j=0; j<arrayThree.length; j++){
			if(max<arrayThree[j]){
				max=arrayThree[j];
			}
		}
		System.out.println(max);
	}

}
