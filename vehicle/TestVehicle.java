package vehicle;



public class TestVehicle {
	public static void main(String[] args) {
		System.out.println("Manufacturer: " + vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: " + vehicle.numvehicle);

		vehicle vehicle1= new vehicle("Vision");
		System.out.println(vehicle1);

		vehicle vehicle2= new vehicle("Edict");
		System.out.println(vehicle2);

		vehicle2.setModel("Seer");
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		
		
		vehicle.Engine vehicle3= new vehicle.Engine("Fortune");
		System.out.println("vehicle number" + vehicle3.getChassisNo()+ " is a"
				+ vehicle3.getModel()+" model and has an engine capacity of"
				+ vehicle3.getCapacity()+"cc");


		System.out.println("Number of vehicles manufactured: " + vehicle.numvehicle);


		}
		}


