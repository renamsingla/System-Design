package parkingLotSystem;

public class Vehicle_Concrete_Factory implements Vehicle_Factory{
	
	@Override
	public Vehicle createVehicle(String numberPlate, VehicleType type) {
		// TODO Auto-generated method stub
		Vehicle v;
		
		switch(type) {
		case CAR:
			v= new Vehicle_Car(numberPlate);
			break;
			
		case BIKE:
			v= new Vehicle_Bike(numberPlate);
			break;
			
		default:
			//not working with error and exception handling , not a good practice
//			v=null;

			throw new IllegalArgumentException("Unsupported VehicleType: " + type);
		}
		
//		if(type==VehicleType.CAR) {
//			v= new Vehicle_Car(numberPlate);
//		}else if(type==VehicleType.BIKE) {
//			v= new Vehicle_Bike(numberPlate);
//		}
		System.out.println("vehicle created- "+v.getNumberPlate() +" "+ v.getType());
		return v;
	}

}
