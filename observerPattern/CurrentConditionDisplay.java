package observerPattern;

public class CurrentConditionDisplay implements DisplayElement, Observer {
	
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.addObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp=temp;
		this.humidity=humidity;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("for current condition- temp= "+temp+" humidity= "+humidity);
		
	}
}
