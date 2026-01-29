package strategyDesign;

public class landDuck extends duck {
	
	public landDuck() {
		quackb= new quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a land duck");
	}
}
