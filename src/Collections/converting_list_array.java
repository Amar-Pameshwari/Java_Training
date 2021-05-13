package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class converting_list_array {

	
	public static void main(String[] args) {
		
		
		List<String> fruitList = new ArrayList<>();    
		 fruitList.add("Mango");    
		 fruitList.add("Banana");    
		 fruitList.add("Apple");    
		 fruitList.add("Strawberry");    
		 
		 System.out.println(fruitList);
		 System.out.println(fruitList.size());
		 
		 String[] array = fruitList.toArray(new String[fruitList.size()]);
		 String array1 = Arrays.toString(array);
		 System.out.println("Printing array"+array1);
		 
		 
		 /* To find the type of instance
		 for(Object object:array){
			 System.out.println(object.getClass().getName());
			 //System.out.println(object.getClass().getTypeName());
			 //System.out.println(object.getClass().getSimpleName());
		 }
		 System.out.println();
		 */
	}

}
