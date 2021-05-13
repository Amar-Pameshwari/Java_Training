package Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class ForEachloopDemo {

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

		Set<Map.Entry<String, String>> entrySet =hm.entrySet();
		
		for(Map.Entry<String, String> entry: entrySet){
			
		System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
		}
	}

}
