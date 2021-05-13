
public class studentDemo {

	int rollno;
	String name;
	String standered;
	
	public studentDemo(int rollno, String name, String standered){
		
		this.rollno =rollno;
		this.name = name;
		this.standered =standered;
		/*
		*/
	}
	
	public void Display(){
		
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("standered:"+standered);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentDemo std = new studentDemo(10, "Amar", "12th");
		
		std.Display();
		
}

}
