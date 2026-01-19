package observerPattern;

import java.util.ArrayList;

//WeatherData

public class ConcreteSubject implements Subject{
	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	//constructor
	public ConcreteSubject() {
		observers= new ArrayList<>();
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i= observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++) {
			Observer observer= (Observer)observers.get(i);
			observer.update(temp,humidity, pressure);
		}
	}
	
	public void measurementChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.humidity=humidity;
		this.pressure=pressure;
		this.temp=temp;
		measurementChanged();
	}
	
	
}
