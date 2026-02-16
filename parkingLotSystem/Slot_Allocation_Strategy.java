package parkingLotSystem;

import java.util.List;

public interface Slot_Allocation_Strategy {
	
	public Parking_Slot allocateSlot(List<Parking_Slot>slots ,Vehicle vehicle);
}
