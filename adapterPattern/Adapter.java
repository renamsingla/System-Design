package adapterPattern;

public class Adapter implements ITarget {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee a) {
		this.adaptee= a;
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("delegating the request to adaptee");
		adaptee.specificRequest();
	}

}
