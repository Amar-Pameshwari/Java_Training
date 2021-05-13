package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class User_JavaArrayList_runMethod {

	
	public static void main(String[] args) {
	
		
		User_JavaArrayList list1 = new User_JavaArrayList(101,"Amar",25);
		User_JavaArrayList list2 = new User_JavaArrayList(102,"Sanvi",30);
		User_JavaArrayList list3 = new User_JavaArrayList(103,"Siya",35);
		
		//first Method to iterate
		
		ArrayList<User_JavaArrayList> a1 = new ArrayList<User_JavaArrayList>();

		a1.add(list1);
		a1.add(list2);
		a1.add(list3);
		
		Iterator itr = a1.iterator();
		
		while(itr.hasNext())
		{
			User_JavaArrayList st = (User_JavaArrayList) itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		  
	}

}
