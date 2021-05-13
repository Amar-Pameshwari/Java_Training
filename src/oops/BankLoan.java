package oops;

public class BankLoan {
	
	private String name;
	private int age;
	private int amount;
	
	public void setname(String name){
		
		this.name = name;
	}

	public void setage(int age){
		
		if (age>=18 && age<=70){
			this.age = age;
		}
		else{
			System.out.println("Age is not valid");
		}
	}

	public void setamount(int amount){
		
		if(amount>1000 && amount<=10000){
		this.amount = amount;
	}
		else{
			System.out.println("Enter amount is not valid");
		}
	}
	
	
	public String getname(){
		
		return name;
	}

	public int getage(){
		
		return age;
	}

	public int getamount(){
	
	return amount;
}
	
	
}
