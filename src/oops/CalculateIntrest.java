package oops;

public class CalculateIntrest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ICICI ici = new ICICI();
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		
		System.out.println(ici.getIntrest());
		System.out.println(sbi.getIntrest());
		System.out.println(hdfc.getIntrest());
	}

}
