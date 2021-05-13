package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	
	public static void main(String[] args) {
	
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Amar", 30);
		hm.put("Balaji", 25);
		hm.put("Sanvi", 7);
		hm.put("Pary", 5);
		hm.put("Vanita", 30);

		System.out.println(hm);
		
		if(hm.containsKey("Amar")){
			System.out.println(hm.get("Amar"));
		}
		
//		First Method of Iterator of Map
		/*Iterator<Map.Entry<String, Integer>> it = hm.entrySet().iterator();
		
		while(it.hasNext()){
			
			Map.Entry<String, Integer> entry = it.next();
			
			System.out.println(entry.getValue());
			
		}*/
		
//		Second Method of Iterator of Map
		
		/*Iterator keySetIterator = hm.keySet().iterator();
		
		while(keySetIterator.hasNext()){
			
			Map.Entry<String, Integer> key = (Map.Entry<String, Integer>) keySetIterator.next();
			
			System.out.println("Key"+key+"Value"+hm.get(key));
		}
		*/
	}

}
