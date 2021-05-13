package oops;

public class Childaddition extends Addition {


	public static void main(String[] args) {
		
		Addition add = new Addition();
		
		add.addvalue(10, 20);
		
		add.addvalue(10, 20, 30);
		
		System.out.println(add.addvalue(40.10, 10.20));

	}

}
