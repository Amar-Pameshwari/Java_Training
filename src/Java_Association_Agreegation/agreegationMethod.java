package Java_Association_Agreegation;


class agreegationMethod 
{

	int streetNum;
	   String city;
	   String state;
	   String country;
	   agreegationMethod(int street, String c, String st, String coun)
	   {
	       this.streetNum=street;
	       this.city =c;
	       this.state = st;
	       this.country = coun;
	   }
}
	
class StudentClass
{
	   int rollNum;
	   String studentName;
	   //Creating HAS-A relationship with agreegationMethod class
	   agreegationMethod studentAddr; 
	   StudentClass(int roll, String name, agreegationMethod addr)
	   {
	       this.rollNum=roll;
	       this.studentName=name;
	       this.studentAddr = addr;
	   }
	   public static void main(String args[])
	   {
	       agreegationMethod ad = new agreegationMethod(55, "Agra", "UP", "India");
	       StudentClass obj = new StudentClass(123, "Chaitanya", ad);
	       System.out.println(obj.rollNum);
	       System.out.println(obj.studentName);
	       System.out.println(obj.studentAddr.streetNum);
	       System.out.println(obj.studentAddr.city);
	       System.out.println(obj.studentAddr.state);
	       System.out.println(obj.studentAddr.country);
	   }
	
}

class College
	{
	   String collegeName;
	   //Creating HAS-A relationship with agreegationMethod class
	   
	   agreegationMethod collegeAddr; 
	   College(String name, agreegationMethod addr){
	       this.collegeName = name;
	       this.collegeAddr = addr;
	   }
	   public static void main(String args[]){
	       agreegationMethod ad1 = new agreegationMethod(56, "Beed", "Maha", "India");
	       College obj1 = new College("JNEC",ad1);
	       
	       System.out.println(obj1.collegeName);
	       System.out.println(obj1.collegeAddr.streetNum);
	       System.out.println(obj1.collegeAddr.city);
	       System.out.println(obj1.collegeAddr.state);
	       System.out.println(obj1.collegeAddr.country);
	   }
	}
	class Staff
	{
	   String employeeName;
	   //Creating HAS-A relationship with agreegationMethod class
	   agreegationMethod StaffAddr; 
	   Staff(String name, agreegationMethod addr){
	       this.employeeName = name;
	       this.StaffAddr = addr;
	   }
	   public static void main(String args[]){
	       agreegationMethod ad2 = new agreegationMethod(57, "Pune", "maha", "India");
	       Staff obj2 = new Staff("Aniket",ad2);
	       
	       System.out.println(obj2.employeeName);
	       System.out.println(obj2.StaffAddr.streetNum);
	       System.out.println(obj2.StaffAddr.city);
	       System.out.println(obj2.StaffAddr.state);
	       System.out.println(obj2.StaffAddr.country);
	   }
	}
	

