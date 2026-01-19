package observerPattern;

public interface Observer {
	//common interface for subject to talk to, to update the observers
	
//	these are the measurement that observer receive from the subject when the weather measurement changes
	public void update(float temp, float humidity, float pressure);
}
