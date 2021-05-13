package Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetDemo {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashSet set = new HashSet<>();
			
			set.add("Amar");
			set.add("Parmeshwari");
			set.add("Beed");
			set.add("India");
			set.add("Amar");
			set.add(null);
			System.out.println(set);
			
			set.remove("India");
			
			System.out.println(set);
			
			Iterator i = set.iterator();
			
			while(i.hasNext()){
				System.out.println(i.next());
			}
			
//			set.clear();
			System.out.println(set.contains("India"));
			set.remove("Amar");
			System.out.println(set);
			
	}

}
