package oops;

public class Circle extends Shapes {

	public void displayShape() {
		
		System.out.println("Shape is Circle");
	}

	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			Shapes circ = new Circle();
			Shapes tri = new Triangle(); 
			
			circ.displayShape();
			tri.displayShape();
			
	}


}
