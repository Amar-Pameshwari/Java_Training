package Iterator;

import java.util.ArrayList;
import java.util.Enumeration;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 =  new ArrayList();
		
		for (int i=0; i<10; i++){
			
			list1.add(i);
			
			Enumeration en = (Enumeration) list1.iterator();
			
			while(en.hasMoreElements()){
				int NextElemt = (Integer) en.nextElement();
				
				System.out.println(NextElemt);
			}
		}
		System.out.println(list1);
	}

}
