package creditCalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
      
		List <Credit> credits = new ArrayList<Credit>();
		credits.add(new OfficierCredit());
		credits.add(new CarCredit());
		credits.add(new NeedCredit());
		
		Application application = new Application(credits);
		application.calculate(2,50000);
		
		
	}

}
