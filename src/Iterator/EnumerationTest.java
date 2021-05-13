package Iterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class EnumerationTest {


		public static void main(String args[]) {

			// Create a vector and print its contents
			Vector<Integer> v = new Vector<>();
			for (int i = 0; i < 10; i++){
				v.addElement(i);
			}
				
			
			System.out.println(v);
			
			Iterator itr = v.iterator();
			
			while(itr.hasNext()){
				
				int nextElemt = (Integer) itr.next();
				
				if(nextElemt%2==0){
					System.out.println(nextElemt);
					}
			}

			// At beginning e(cursor) will point to
			// index just before the first element in v
/*			Enumeration e = v.elements();

			// Checking the next element availability
			while (e.hasMoreElements()) {
				// moving cursor to next element
				int i = (Integer) e.nextElement();

				if(i%2==0){
				System.out.print(i + " ");
				
				}
				
				}
*/			
		}
	}
