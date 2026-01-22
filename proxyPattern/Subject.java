package proxyPattern;

public class Subject implements ISubject {
	
	private int numberOfLetters;
	private String str;
	
	//we used Proxy-pattern as instantiating this class was expensive (assume)
	public Subject(String str) {
		//some computation in it
		this.str= str;
	}

	@Override
	public int request() {
		// TODO Auto-generated method stub
	//this method uses the computation in the above methods	
		numberOfLetters= str.length();
		return numberOfLetters;
	}

}
