package parkingLotSystem;

import java.time.LocalDateTime;
import java.util.*;

public class ParkingLot {
	private final Map<String, Ticket> activeTicket=new HashMap<>();
	private final Slot_Manager slotManager;
	private int ticketCounter=0;
	private final List<Parking_Slot>slots;
	
	//thread safety , one instance only
	private static final ParkingLot parkingLot= new ParkingLot();
	
	//constructor
	private ParkingLot() {
		slots= new ArrayList<>();
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				slots.add(new Parking_Slot("CAR"+i, VehicleType.CAR));
			}else {
				slots.add(new Parking_Slot("BIKE"+i, VehicleType.BIKE));
			}
		}
		slotManager= new Slot_Manager(slots, new First_Available_Allocation_Strategy());
	}
	
	//only one instance is created with method calling due to static 
	public static ParkingLot getInstance() {
		return parkingLot;
	}
	
	
	//park the vehicle and return ticket to the user
	//business API
	public Ticket parkVehicle(Vehicle vehicle) {
		Parking_Slot slot= slotManager.allocateSlot(vehicle);
		ticketCounter++;
		Ticket ticket= new Ticket(vehicle, slot, LocalDateTime.now(), "T"+ticketCounter);
		activeTicket.put(ticket.getTicketId(), ticket);
		return ticket;
	}
}
