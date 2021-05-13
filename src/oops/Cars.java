package oops;

public class Cars {
	
	String name = "New Skoda";
	
	
	Cars(){
		System.out.println("Car is constructor");
	}
	
	public final void setWheels(){
		System.out.println("There are 4 wheeler in car");
	}
	
	public void run(){
		System.out.println("Car is Runnning");
	}

}
