package adapterPattern2;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("i gobble");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i only fly for short period of time");
	}

}
