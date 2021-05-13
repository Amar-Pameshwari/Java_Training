package Map;

import java.util.LinkedHashMap;

public class linkedhashmapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		
		lmap.put("Amar", 1);
		lmap.put("Balaji", 2);
		lmap.put("Sanvi", 3);
		lmap.put("Pary", 4);
		lmap.put("Vanita",5);
		
		System.out.println(lmap);

		


	}

}
