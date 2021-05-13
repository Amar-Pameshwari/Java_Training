package Map;

import java.util.HashMap;
import java.util.Set;

public class ForeachLoopKeySet {

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

		System.out.println(hm);
		
		Set<String> keySet = hm.keySet();
		
		for(String key:keySet){
			
			System.out.println("Key:"+key +" "+"Value"+hm.get(key));
			
		}

	}

}
