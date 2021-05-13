package ExceptionHandlingLog;

public class nestedTryCatch {

	public static void main(String[] args) {

		try{
			System.out.println("First Try block");
			String name = "Amar";
			System.out.println(name.length());
			
			try{
				System.out.println("Second Try block");
				int value = 100;
				int result = value/5;
				
				try{
					System.out.println("Third try block");
					 
					int array[] = new int[10];
					array[14] = 100;
					
				}catch(Exception e){
					System.out.println("Third catch block");
					e.printStackTrace();
				}finally{
					System.out.println("Hey Hi");
				}
				
			}catch(Exception e){
				System.out.println("End second catch block");
				e.printStackTrace();
			}
			
		}catch(Exception e){
			System.out.println("End first catch");
			
			e.printStackTrace();
		}

	}

}
