package parkingLotSystem;

public class Vehicle_Car extends Vehicle{

	protected Vehicle_Car(String numberPlate) {
		super(numberPlate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return VehicleType.CAR;
	}
	
	
}
