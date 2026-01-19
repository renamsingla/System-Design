package strategyDesign;

// the DuckCall is not inheriting Duck, but it has a quackBehaviour 
//which further its construction makes a object and a method is defined using that object
public class DuckCall {
	quackBehaviour quackb;
	
	public DuckCall(){
		quackb= new quack();
	}
	
	public void performQuack() {
//		quackb is quackBehaviour.quackk();
		quackb.quackk();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckCall abc= new DuckCall();
		abc.performQuack();
	}

}
