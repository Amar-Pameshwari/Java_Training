package Inheritance;

class JavaExample {

	   private String designation = "Teacher";
	   private String collegeName = "Beginnersbook";
	   public String getDesignation() {
		return designation;
	   }
	   protected void setDesignation(String designation) {
		this.designation = designation;
	   }
	   protected String getCollegeName() {
		return collegeName;
	   }
	   protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	   }
	   void does(){
		System.out.println("Teaching");
	   }
	}

	public class privateNprotectedMethod extends JavaExample{
	   String mainSubject = "Physics";
	   public static void main(String args[]){
		   privateNprotectedMethod obj = new privateNprotectedMethod();
		/* Note: we are not accessing the data members 
		 * directly we are using public getter method 
		 * to access the private members of parent class
		 */
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
	   }
	}

