package strategyDesign;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duck mallar= new mallarDuck();
		
		mallar.performfly();
		mallar.performquack();
		
		mallar.display();
		
//		changing the type of object at runtime 
		mallar.setperformfly(new FlyNoWings());
		mallar.setperformquack(new Mute());
		
		mallar.performfly();
		mallar.performquack();
		
		
		duck landDuck= new landDuck();
		landDuck.display();
		landDuck.performquack();
//		landDuck.performfly(); //this gave null pointer error because the flyb is not instantiated but only declared
	}

}
