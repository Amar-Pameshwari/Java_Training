package ExceptionHandlingLog;

public class exceptionhand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try
		{
		int a =100;
		
		int b = a/0;
		
		System.out.println(b);
		}
		catch(Exception e){
			System.out.println("please enter differnet value");
			
//			System.out.println(e); //Same concept
			
			e.printStackTrace();  //Same concept
		}
		
		try{
		String name = null;
		System.out.println(name.length());
		}
		catch(Exception e1){
			System.out.println(e1);
			e1.printStackTrace();
		}
	}

}
