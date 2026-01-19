package decoratorPattern;

public class Mocha extends AddOnDecorator{
	
	Beverage beverage;
	
	//constructor
	public Mocha(Beverage b) {
		this.beverage=b;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" with Mocha";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 1;
	}

}
