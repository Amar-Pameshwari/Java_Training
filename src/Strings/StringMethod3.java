package Strings;

public class StringMethod3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String text = "Hi, My Name is Amar";
		
		String array[] = text.split(" ");
		
		for(int i = 0; i<array.length; i++){
			System.out.println(array[i]);
		}

		System.out.println(text.startsWith("My"));
	}
	

}
