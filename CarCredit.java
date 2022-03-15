package creditCalculator;

public class CarCredit implements Credit {
	

	@Override
	public void calculate(int creditYear, double creditPrice) {
		
		double creditPayBack = (creditYear*creditPrice*0.18+creditPrice);
		System.out.println(creditPrice + " miktarindaki ücretin geri ödemesi " + creditYear+ " yil sonunda " + creditPayBack+ " dir." );
	}

}
