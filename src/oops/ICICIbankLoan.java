package oops;

public class ICICIbankLoan extends BankLoan {

	public static void main(String[] args) {

		BankLoan bank = new BankLoan();
		
		bank.setname("Amar");
		bank.setage(44);
		bank.setamount(1001);
		
		System.out.println("Name:"+bank.getname());
		
		System.out.println("Age:"+bank.getage());
		
		System.out.println("Amount:"+bank.getamount());
	}

}
