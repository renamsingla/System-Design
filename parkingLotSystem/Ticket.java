package parkingLotSystem;

import java.time.*;

public class Ticket {
	private final String ticketId;
	private final Vehicle vehicle;
	private final Parking_Slot slot;
	private final LocalDateTime entryTime;
	private LocalDateTime exitTime;
	private boolean isActive;
	
	//when ticket will be created- CONSTRUCTOR
	public Ticket(Vehicle vehicle, Parking_Slot slot, LocalDateTime entryTime, String ticketId) {
		this.vehicle=vehicle;
		this.slot=slot;
		this.entryTime=entryTime;
		this.exitTime=null;
		this.isActive=true;
		this.ticketId=ticketId;
	}
	
	//GETTER METHODS
	public String getTicketId() {
		return this.ticketId;
	}
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	public Parking_Slot getSlot() {
		return this.slot;
	}
	public boolean isActive() {
		return this.isActive;
	}
	public LocalDateTime getEntryTime() {
		return this.entryTime;
	}
	
	public void closeTicket(LocalDateTime exitTime) {
		if (!isActive) {
	        throw new IllegalStateException("Ticket already closed");
	    }
	    if (exitTime.isBefore(entryTime)) {
	        throw new IllegalArgumentException("Invalid exit time");
	    }
		this.exitTime= exitTime;
		this.isActive= false;
	}
	
	public long getDurationInMinutes() {
		if (exitTime == null) {
	        throw new IllegalStateException("Ticket not closed yet");
	    }
		return Duration.between(entryTime, exitTime).toMinutes();
	}
	
}
