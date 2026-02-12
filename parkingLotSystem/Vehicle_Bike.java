package parkingLotSystem;

public class Vehicle_Bike extends Vehicle{

	protected Vehicle_Bike(String numberPlate) {
		super(numberPlate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return VehicleType.BIKE;
	}

}
															