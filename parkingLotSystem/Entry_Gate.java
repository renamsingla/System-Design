package parkingLotSystem;

public class Entry_Gate {
	private final String gateId;
	private final ParkingLot parkingLot;
	
	public Entry_Gate() {
		this.parkingLot=ParkingLot.getInstance();
		this.gateId="gate no.1";
	}
	
	public Ticket parkVehicle(Vehicle vehicle) {
		Ticket ticket= parkingLot.parkVehicle(vehicle);
		return ticket;
	}
	
}
