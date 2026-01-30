package decoratorPattern;

public class Soy_Milk extends AddOnDecorator{
	
	Beverage beverage;
	
	public Soy_Milk(Beverage b) {
		this.beverage=b;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+ " with soy milk";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost()+10;
	}

}
