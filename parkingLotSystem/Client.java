package parkingLotSystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot parkingLot=ParkingLot.getInstance();
		
		//create vehicle
		Vehicle_Factory factory = new Vehicle_Concrete_Factory();
		Vehicle car = factory.createVehicle("KA01AB1234", VehicleType.CAR);
		Vehicle car1 = factory.createVehicle("KA01AB1234", VehicleType.CAR);
		Vehicle car2 = factory.createVehicle("KA01AB1234", VehicleType.CAR);
		Vehicle car3 = factory.createVehicle("KA01AB1234", VehicleType.CAR);
		Vehicle car4= factory.createVehicle("KA01AB1234", VehicleType.CAR);
		Vehicle car5 = factory.createVehicle("KA01AB1234", VehicleType.CAR);
		
		//park vehicle
		Ticket ticket= parkingLot.parkVehicle(car);
		System.out.println("ticket for parking "+ ticket.getTicketId()+", Slot- "+ ticket.getSlot().getId()+
				" ,Vehicle- "+ ticket.getVehicle().getNumberPlate()+" ,EntryTime- "+ticket.getEntryTime());
		Ticket ticket1= parkingLot.parkVehicle(car1);
		System.out.println("ticket for parking "+ ticket1.getTicketId()+", Slot- "+ ticket1.getSlot().getId()+
				" ,Vehicle- "+ ticket1.getVehicle().getNumberPlate()+" ,EntryTime- "+ticket1.getEntryTime());
		Ticket ticket2= parkingLot.parkVehicle(car2);
		System.out.println("ticket for parking "+ ticket2.getTicketId()+", Slot- "+ ticket2.getSlot().getId()+
				" ,Vehicle- "+ ticket2.getVehicle().getNumberPlate()+" ,EntryTime- "+ticket2.getEntryTime());
		Ticket ticket3= parkingLot.parkVehicle(car3);
		System.out.println("ticket for parking "+ ticket3.getTicketId()+", Slot- "+ ticket3.getSlot().getId()+
				" ,Vehicle- "+ ticket3.getVehicle().getNumberPlate()+" ,EntryTime- "+ticket3.getEntryTime());
		Ticket ticket4= parkingLot.parkVehicle(car4);
		System.out.println("ticket for parking "+ ticket4.getTicketId()+", Slot- "+ ticket4.getSlot().getId()+
				" ,Vehicle- "+ ticket4.getVehicle().getNumberPlate()+" ,EntryTime- "+ticket4.getEntryTime());
		Ticket ticket5= parkingLot.parkVehicle(car5);
		System.out.println("ticket for parking "+ ticket5.getTicketId()+", Slot- "+ ticket5.getSlot().getId()+
				" ,Vehicle- "+ ticket5.getVehicle().getNumberPlate()+" ,EntryTime- "+ticket5.getEntryTime());
	}

}
