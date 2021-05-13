package Strings;

public class StringBufferIntro {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String Buffer Method	
		String name = "Amar";
		name.concat("Parmeshwari"); //IMMutable String-Can't change 
		
		System.out.println(name);
		
		
		StringBuffer name1 = new StringBuffer("Amar");
		name1.append("Parmeshwari"); //Mutable String
		System.out.println(name1);
		
		name1.delete(4, 10);
		
		name1.replace(3,5, "Lo");
		
		name1.reverse();
		
		name1.insert(3, "Fakt");
		System.out.println(name1);
		
		
		
	//String Builder Method
		try{
		StringBuilder name = new  StringBuilder("Amar");
		
		name.append("Parmeshwari");
		
		System.out.println(name);
		
		name.insert(0, "beed");
		
		System.out.println(name);
				
		name.append("beed").append("Punawale").append("hcl");
		System.out.println(name);
		}catch(Exception e){
			e.printStackTrace();
		}
				
		
	}

}
