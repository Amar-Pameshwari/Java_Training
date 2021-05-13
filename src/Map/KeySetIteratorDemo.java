package Map;

import java.util.HashMap;
import java.util.Iterator;

public class KeySetIteratorDemo {

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
		
		Iterator keySetIterator = hm.keySet().iterator();
		
		while(keySetIterator.hasNext()){
			
			String key = (String) keySetIterator.next();
			
			System.out.println("Key:"+key+" "+"Value:"+hm.get(key));
		}

	}

}
