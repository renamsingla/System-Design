package parkingLotSystem;

public interface Vehicle_Factory {
	
	public Vehicle createVehicle(String numberPlate, VehicleType type);
}
