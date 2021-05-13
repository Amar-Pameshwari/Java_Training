package Inheritance;

public class TerraA {

	String name = "TerraA-1601";
	
	public void run(){
		
		System.out.println("TerraA is ready");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hieraricalInheritance obj = new hieraricalInheritance();
		obj.run();
		
		TerraB obj2 = new TerraB();
		obj2.run();

	}

}
