
public class Counterclass {

	int i =0;
	static int j =0;
	
	
	
	public Counterclass() {
		i++;
		j++;
		
				
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		System.out.println("j:"+j);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counterclass counter = new Counterclass();
		Counterclass counter1 = new Counterclass();
		Counterclass counter2 = new Counterclass();
		
	
	}

}
