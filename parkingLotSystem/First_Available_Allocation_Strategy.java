package parkingLotSystem;

import java.util.List;

public class First_Available_Allocation_Strategy implements Slot_Allocation_Strategy {

	@Override
	public Parking_Slot allocateSlot(List<Parking_Slot> slots, Vehicle vehicle) {
		// TODO Auto-generated method stub
		for(Parking_Slot slot: slots) {
			if(vehicle.getType()==slot.getSlotType() && slot.isSlotAvailable()) {
				System.out.println("vehicle slot "+ slot.getId());
				return slot; 
			}
		}
		return null;
	}

}
