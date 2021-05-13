package oops;

public interface Student extends parentStudent {
	

	public static final String university  = "Univercity of New York";
	
//No need to declare abstract keyword here, Java automatically understand this is an abstract
	public void displayName();
	
	public void getStudentNumber();
	
	public void getStandard();
}
