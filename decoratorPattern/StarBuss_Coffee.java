package decoratorPattern;

public class StarBuss_Coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b= new Espresso();
		b= new Mocha(b);
		System.out.println(b.getDescription());
		System.out.println(b.cost());
	}

}
