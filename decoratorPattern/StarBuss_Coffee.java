package decoratorPattern;

public class StarBuss_Coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b= new Espresso();
		b= new Mocha(b);
		b= new Soy_Milk(b);
		System.out.println(b.getDescription());
		System.out.println(b.cost());
		
		Beverage b1= new Espresso();
		Beverage b2= new Mocha(b1);
		Beverage b3 = new Soy_Milk(b2);
		System.out.println(b3.getDescription());
		System.out.println(b3.cost());
	}

}
