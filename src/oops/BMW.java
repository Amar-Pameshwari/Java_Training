package oops;

public class BMW  extends Cars{

	//Static String name = "BMW";
	
	String name = "BMW";
	final int price = 100;
	
	BMW(){
		super();
		System.out.println("BMW is constructor");
	}
	
/*	public void setWheels(){
		
	}
*/		
	public void getName(){
		
//		price =110; -- Can't assign as Final key word use for price above in class
		System.out.println("Name:"+name);
		System.out.println("Name:"+super.name);
		
	}
	
	public void run(){
		System.out.println("BMW is Runnning");
		super.run();
	}
	/* Can't override method as Final key word restrict
	public void setWheels(){
		System.out.println("There are 4 wheeler in car");
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Cars car = new Cars();
		System.out.print("Car name:"+car.name+"\n");
//		System.out.println("\n"+price);
		car.run();
		*/
		/*BMW bmw = new BMW();
		bmw.getName();
		bmw.run();
		bmw.setWheels();
		
		System.out.println("\n"+bmw.price);*/
		
		Cars bmw1 = new BMW();
		
		BMW bmw = (BMW) new Cars();
		
		bmw.getName();
		bmw.run();
		bmw.setWheels();
	}

}
