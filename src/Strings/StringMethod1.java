package Strings;

public class StringMethod1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Hi Am learning Java";
		
		System.out.println("4th character is:"+text.charAt(4));
		
		String text1 = text.concat(" For job").concat(" no For better job");
		
		
		System.out.println(text1);

		System.out.println(text.contains("Java"));
	
				
		System.out.println("Start with:"+text.startsWith("i"));
		
		System.out.println("Start with:"+text.startsWith("m", 4));
		
		System.out.println("Find char end wth Java: "+text.endsWith("Java"));
		
		
	}

}
