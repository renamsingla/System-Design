package strategyDesign;

public class mallarDuck extends duck{
	
	public mallarDuck() {
//		ll= new ArrayList();
		//instantiating the behaviour that was declared in the super class
		//by creating object- dependency injection
		quackb= new quack();
		flyb= new flyWithWngs();
	}
	
	public void display() {
		System.out.println("i am mallarduck");
	}
}
