package adapterPattern2;

public class TurkeyAdapter implements Duck{
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey t) {
		this.turkey= t;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
	}

}
