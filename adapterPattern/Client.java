package adapterPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITarget target= new Adapter(new Adaptee());
		target.request();
	}

}
