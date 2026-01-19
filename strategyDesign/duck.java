package strategyDesign;

public abstract class duck {
//	STRATEGY 
//	this is called composition and not implementation
	//here flyBheaviour is the type of interface having reference to the object that can implement the behaviour
//	it is same as having interface of List and implementing when we required as ArrayList or anything which is a class
//	List ll;
	flyBehaviour flyb;
	quackBehaviour quackb;
	
	public void performfly() {
//		flyb will have a type of class when object of type of subclass of duck will be made like flywithwings and calling the method fly()
		flyb.fly();
	}
	
	public void setperformfly(flyBehaviour fb) {
		flyb=fb;
	}
	
	
	public void performquack() {
		quackb.quackk();
	}
	
	public void setperformquack(quackBehaviour qb) {
		quackb=qb;
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();
}
