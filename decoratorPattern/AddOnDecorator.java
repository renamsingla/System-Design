package decoratorPattern;

public abstract class AddOnDecorator extends Beverage{ //to be inter-changable with the Beverage 
//if this class was not abstract then it had to implement the abstract methods, which we do not want
	public abstract String getDescription();

}
