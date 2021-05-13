package Iterator;

import java.util.LinkedList;

public class LinkedListDemo {

	
	public static void main(String[] args) {
	
		LinkedList linkList = new LinkedList();
		
		for(int i=0; i<10; i++){
			
			linkList.add(i);
		}
		
		System.out.println(linkList);
		
		linkList.addFirst("Amar");
		linkList.addLast("Beed");
		System.out.println(linkList);
		
		linkList.removeFirst();
		
		linkList.removeLast();
		
		System.out.println(linkList);
	}

}
