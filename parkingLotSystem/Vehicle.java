package parkingLotSystem;

public abstract class Vehicle {

	//every vehicle has a number plate can be used as there primary id
	private final String numberPlate;
	
	//constructor
	protected Vehicle(String numberPlate){
		this.numberPlate= numberPlate;
	}
	
	//this is not abstract because the implementation of method remain same across extended classes
	public String getNumberPlate() {
		return this.numberPlate;
	}
	
	//every vehicle is going to be of a specific type- car, bike , truck.... POLYMORPHISM
	public abstract VehicleType getType();

}
