package Strings;

public class StringIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Amar Parmeshwari";
		String name1 = "Amar Parmeshwari";
		
		String city = new String("Beed");
		String city1 = new String("Beed");
		
		//First Method
		System.out.println(name.equals(name1));
		System.out.println(city.equals(city1));
		
		//Second Method
		System.out.println(name==name1);
		System.out.println(city==city1);
		
		System.out.println(name.concat(name1));
		System.out.println(city.concat(city1));
	}

}
