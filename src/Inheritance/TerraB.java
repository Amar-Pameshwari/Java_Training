package Inheritance;

public class TerraB {

	String name = "TerraB";
	
	public void run(){
		
		System.out.println("TerraB is in under construction");
	}
	
	public static void main(String[] args) {
		
		hieraricalInheritance obj = new hieraricalInheritance();
		obj.run();

		TerraB obj2 = new TerraB();
		obj2.run();
		
	}

}
