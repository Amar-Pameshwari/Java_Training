package oops;

public class X3 extends BMW{

	static String model = "X3";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW bmw = new BMW();
		System.out.println("Model is:"+model);
		System.out.println("Name:"+bmw.name);
		bmw.run();
		
	}

}
