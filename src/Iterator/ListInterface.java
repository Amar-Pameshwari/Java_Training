package Iterator;

import java.util.ArrayList;
import java.util.List;


public class ListInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		l1.add(0,1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		
		
		
		/*l1.addAll(1, 2);
		System.out.println(l1);
		System.out.println(l1.get(5));
		
		l1.set(2, 5); //Modify the existing list
		System.out.println(l1);
		
		System.out.println(l1.indexOf(5));
		System.out.println(l1.lastIndexOf(5));*/
		
		List l3 = new ArrayList();
	
		l3 = l1.subList(1,5);
		
System.out.println(l3);

l3.remove(2);
System.out.println(l3);
	}

}
