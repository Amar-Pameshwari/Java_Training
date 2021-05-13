package oops;

public class MedicalStudent implements Student {

	public void displayName() {

		System.out.println("We are medical student");
	}

	public void getStudentNumber() {

		System.out.println("We are 20 student");
	}

	public void getStandard() {

		System.out.println("We are medical");
	}

	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MedicalStudent med = new MedicalStudent();
		Student med = new MedicalStudent();
		//EngineeringStud Eng = new EngineeringStud();
		Student Eng = new EngineeringStud();
		
		Eng.displayName();
		Eng.getStudentNumber();
		Eng.getStandard();
		
		System.out.println("*********************************");
		
		med.displayName();
		med.getStudentNumber();
		med.getStandard();
		
	}


}
