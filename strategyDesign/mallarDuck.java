package strategyDesign;

public class mallarDuck extends duck{
	
	public mallarDuck() {
//		ll= new ArrayList();
		quackb= new quack();
		flyb= new flyWithWngs();
	}
	
	public void display() {
		System.out.println("i am mallarduck");
	}
}
