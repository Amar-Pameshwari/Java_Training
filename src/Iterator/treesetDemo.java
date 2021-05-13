package Iterator;

import java.util.TreeSet;

public class treesetDemo {

	
	public static void main(String[] args) {
	
		TreeSet tSet = new TreeSet();
		
		tSet.add(12);
		tSet.add(25);
		tSet.add(30);
		tSet.add(10);
		tSet.add(60);
		tSet.add(70);
				

		System.out.println(tSet);
		
		System.out.println("It contains 12?"+tSet.contains(12));
		
		System.out.println("First Element:"+tSet.first());
		System.out.println("First Element:"+tSet.last());
		
		System.out.println("head Set:"+tSet.headSet(30));
		System.out.println("head Set:"+tSet.tailSet(30));
		
		System.out.println("Subset:"+tSet.subSet(25, 80));
		
		tSet.clear();
		System.out.println(tSet);
	}

}
