package parkingLotSystem;
//slot only decides if it can accept a vehicle or not
public class Parking_Slot {
	//final because cannot be changed, private so other do not have direct access to change the state
	private final String id;
	private final VehicleType allowedVehicleType;
	private Vehicle occupiedVehicle;
	
	//constructor
	public Parking_Slot(String id, VehicleType allowedVehicleType) {
		this.id=id;
		this.allowedVehicleType=allowedVehicleType;
		this.occupiedVehicle=null;
	}
	
	//method to change the state to be occupied by a vehicle
	public void park(Vehicle vehicle) {
		if(occupiedVehicle!=null) {
			//we specify the error for JVM to know
			throw new IllegalStateException ("slot already occupied");
		}
		if(allowedVehicleType!=vehicle.getType()) {
			throw new IllegalArgumentException ("this vehicle type can not be parked in this slot");
		}
		occupiedVehicle=vehicle;
	}
	
	//method to change  the state to empty
	public void vacate() {
		if(occupiedVehicle==null) {
			throw new IllegalStateException ("slot is already vacate");
		}
		occupiedVehicle=null;
	}
	
	//getter methods for the fields as they all are private
	public String getId() {
		return this.id;
	}
	
	public boolean isSlotAvailable() {
		return this.occupiedVehicle==null;
	}
	
	public VehicleType getSlotType() {
		return this.allowedVehicleType;
	}
}
