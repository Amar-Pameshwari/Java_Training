
public class Student {

	int rollno;
	String name;
	
	// Default Constructor
	public Student() {
		// TODO Auto-generated constructor stub
	System.out.println("My name is Amar");
	}

	
	
	public Student(int i, String j) {
	
		rollno = i;
		name = j;
	}
	
	public void display(){
		System.out.println("My rollno is"+rollno+"\n"+"My name is" +name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
	
	Student obj1 = new Student(10, "Amar");
	//System.out.println(obj1);
	
	obj1.display();
	}

}
