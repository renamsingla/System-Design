package adapterPattern2;

public class DuckTestDrive {
//it only knows about the Duck interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal duck instantiation
		Duck duck= new MallarDuck();
		System.out.println("the duck says- ");
		duck.quack();
		duck.fly();
		System.out.println();
		
		//normal turkey instantiation
		Turkey turkey= new WildTurkey();
		System.out.println("the turkey says- ");
		turkey.gobble();
		turkey.fly();
		System.out.println();
		
		//the turkey is wrapped inside the turkeyAdapter to behave as a duck
		//turkey is instantiated adapted as a duck
		Duck duck2= new TurkeyAdapter(new WildTurkey());
		System.out.println("i am a turkey wrapped as duck says- ");
		duck2.quack();
		duck2.fly();
	}

}
