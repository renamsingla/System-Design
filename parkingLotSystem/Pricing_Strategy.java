package parkingLotSystem;

public interface Pricing_Strategy {
	
	public double calculateFees(String type, int entryTime, int exitTime);
}
