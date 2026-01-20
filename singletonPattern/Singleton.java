package singletonPattern;

public class Singleton {
	
	//the private modifier let us not access the constructor 
	//unless and until we are in the singleton class only 
	//hence cannot instantiate a Singleton , by using->  new Singleton()
;	private Singleton() {
		
	}
	
	static private Singleton instance; //static variable that stores a singleton called "instance"
	
	public static Singleton getInstance() {
		//here this method returns an instance of Singleton 
		//and we have to make sure that we return the same instance
		//since this method is public we can do -> Singleton.getInstance();
		
		//in this method we have access to the constructor
		// return new Singleton();
		//but to use the same instance-
		
		if(instance == null) {
			//instantiating the Singleton and store it in the "instance" variable
			instance = new Singleton();
		}
		return instance;
	}
	
	//Singleton class can be having other responsibilities as well......
	private int add;
	public int sum(int a, int b) {
		if(add==30) {
			return add;
		}
		System.out.println(a);
		return add=a+b;
	}
}
