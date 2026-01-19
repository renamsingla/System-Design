package observerPattern;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject weatherData= new ConcreteSubject();
		CurrentConditionDisplay currentdisplay= new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 34);
	}

}
