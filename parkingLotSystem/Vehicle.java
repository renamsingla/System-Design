package parkingLotSystem;

public abstract class Vehicle {

	//every vehicle has a number plate can be used as there primary id
	int numberPlate;
	
	//constructor
	protected Vehicle(int numberPlate){
		this.numberPlate= numberPlate;
	}
	
	public int getNumberPlate() {
		return this.numberPlate;
	}
	
	//every vehicle is going to be of a specific type- car, bike , truck.... defined at runtime
	public abstract VehicleType getType();

}
