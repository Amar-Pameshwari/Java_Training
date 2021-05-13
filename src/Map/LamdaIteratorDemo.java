package Map;

import java.util.HashMap;


public class LamdaIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("Amar", "Parmeshwari");
		hm.put("Balaji", "Gaikwad");
		hm.put("Sanvi", "Par");
		hm.put("Pary", "Parme");
		hm.put("Vanita", "Parmesh");

//		System.out.println(hm);

//		hm.forEach((k,v) -> {System.out.println("Key:"+k+"Value:"+v);});
		
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
	}

}
