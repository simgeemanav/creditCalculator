package creditCalculator;

import java.util.List;

public class Application {
	
	List<Credit> creditList;
	

	public Application(List<Credit> creditList) {
		this.creditList = creditList;
	}
	
	public void calculate (int creditYear, int creditPrice) {
		if(creditList.size()>0) {
			for (Credit credit : creditList) {
				credit.calculate(creditYear,creditPrice);
			}
		}else {
			System.out.println("kredi giriniz");
		}
	}
	

}
