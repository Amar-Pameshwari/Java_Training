package Iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		ArrayList al = new ArrayList();
		
		LinkedList List = new LinkedList<>();
		
		
		for(int i=0; i<10; i++){
			List.add(i);
			
		}
		System.out.println("Element of array:"+List);
		
		ListIterator ltr = List.listIterator();
		
				
		while(ltr.hasNext()){
			int nextElemt = (int) ltr.next();
						System.out.println(nextElemt);
			
			if(nextElemt%2 ==0){
				nextElemt++;
				ltr.set(nextElemt);
				ltr.add(nextElemt);
			}
			
		}

		System.out.println("Forward Direction");
		System.out.println("After modification"+List);
		
		System.out.println("Backward Direction");	
		while(ltr.hasPrevious()){
			int previousElemt = (Integer) ltr.previous();
			
			System.out.println(previousElemt);
		}
		ltr.next();
		System.out.println(ltr.nextIndex());
		
		System.out.println(ltr.previousIndex());
		/*ltr.previous();
		System.out.println(ltr.nextIndex());
		*/
		ltr.remove();
		System.out.println(ltr);
		
		/*ltr.set(0);
		
		System.out.println(ltr);*/
		
		
	}

}
