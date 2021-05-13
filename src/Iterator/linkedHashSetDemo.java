package Iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSetDemo {

	
	public static void main(String[] args) {
	
		LinkedHashSet set = new LinkedHashSet<>();
		
		set.add(123);
		set.add("Parmeshwari");
		set.add("Amar");
		set.add("Beed");
		set.add(456);

		System.out.println(set);
		System.out.println(set.contains("Amar"));

		
		set.clone();
		System.out.println(set);
		
		set.remove("Amar");
		System.out.println(set);
		
		Iterator i = set.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		set.remove(456);
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
				
	}

}
