package creditCalculator;


public class NeedCredit implements Credit{
	

	@Override
	public void calculate(int creditYear, double creditPrice) {
		
		double creditPayBack = (creditYear*creditPrice*0.21+creditPrice);
		System.out.println(creditPrice + " miktarindaki ücretin geri ödemesi " + creditYear+ " yil sonunda " + creditPayBack+ " dir." );
		
	}

}
