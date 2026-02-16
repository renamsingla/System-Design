package parkingLotSystem;

import java.util.*;

public class Slot_Manager {
	private final List<Parking_Slot> slots;
//	private HashMap<String, Parking_Slot> slotMapping; //one way of doing, otherwise ticket should keep the record for the exit system
	
	
	//has a behaviour - slotMaager has allocation strategy
	//DEPENDANCY INJECTION
	private final Slot_Allocation_Strategy allocationStrategy;
	
	public Slot_Manager(List<Parking_Slot> slots,Slot_Allocation_Strategy allocationStrategy ) {
		this.slots=slots;
		this.allocationStrategy=allocationStrategy;
//		this.slotMapping= new HashMap<>();
	}
	
	public Parking_Slot allocateSlot(Vehicle vehicle) {
		Parking_Slot slot= allocationStrategy.allocateSlot(slots, vehicle);
		if(slot==null) {
			throw new IllegalStateException("no slot available");
		}
		slot.park(vehicle);
		System.out.println("vehicle slot allocated for parking");
		return slot;
	}
	
	//SELECTION AND RESERVATION FOR THE SLOT OF PARKING
//	public Parking_Slot allocateSlot(Vehicle vehicle) {
//		for(Parking_Slot slot: slots) {
//			if(vehicle.getType()==slot.getSlotType() && slot.isSlotAvailable()) {
//				slot.park(vehicle); //allocate the vehicle as well to avoid race condition
////				this.slotMapping.put(vehicle.getNumberPlate(), slot); //to keep track of slots that has been occupied during vacancy
//				return slot; //and for the ticket return the allocated slot
//			}
//		}
//		throw new IllegalStateException("no slot available");
//	}
	
	
	public void vacateSlot(Parking_Slot slot) {
		slot.vacate();
	}
	
}
