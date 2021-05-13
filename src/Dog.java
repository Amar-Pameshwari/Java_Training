
public class Dog {

	
	String name = "Jacky";

	String brred = "BullDog";

	int height = 4;
	
	public void barking()
	{
		System.out.println(name +" is barking");
	}
	
	public void type() {
		
		System.out.println(brred +"is dog");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dogclass = new Dog();
		dogclass.barking();
		dogclass.type();
		System.out.println();
//System.out.println(dogclass.brred);
	//System.out.println(dogclass.height);
	}

}
