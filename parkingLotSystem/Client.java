package parkingLotSystem;

public class Client {
	
	public static Ticket park(Entry_Gate gate, Vehicle vehicle) {
		Ticket ticket=gate.parkVehicle(vehicle);
		
		System.out.println(
		        "Ticket: " + ticket.getTicketId() +
		        " | Slot: " + ticket.getSlot().getId() +
		        " | Vehicle: " + ticket.getVehicle().getNumberPlate() +
		        " | Entry: " + ticket.getEntryTime()
		    );
		System.out.println();
		return ticket;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create vehicle
		Vehicle_Factory factory = new Vehicle_Concrete_Factory();
		
		//client has only access to entry gate
		Entry_Gate entryGate= new Entry_Gate();
		
		Vehicle car = factory.createVehicle("KA01AB1234", VehicleType.CAR);
		Ticket ticket= park(entryGate,car);
		
		Vehicle car1 = factory.createVehicle("KA01AB5678", VehicleType.CAR);
		Ticket ticket1= park(entryGate,car1);
		
		Vehicle car2 = factory.createVehicle("KA01AB9999", VehicleType.CAR);
		Ticket ticket2= park(entryGate,car2);
		
		Vehicle car3 = factory.createVehicle("KA01AB1111", VehicleType.CAR);
		Ticket ticket3= park(entryGate,car3);
		
		Vehicle car4= factory.createVehicle("KA01AB2222", VehicleType.CAR);
		Ticket ticket4= park(entryGate,car4);
		
		Vehicle car5 = factory.createVehicle("KA01BIKE1", VehicleType.BIKE);
		Ticket ticket5= park(entryGate,car5);
		
	}

}
