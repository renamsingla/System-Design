package decoratorPattern;

public class Espresso extends Beverage {
	
//	constructor
	public Espresso() {
		//Remember the description instance variable is inherited from Beverage
		description="espresso";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 10;
	}

}
