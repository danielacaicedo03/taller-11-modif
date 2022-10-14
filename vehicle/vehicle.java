package vehicle;

public class vehicle {
	 
		 public final static String MAKE ="Augur";
		 public static int numvehicle =0;
		 private String chassisNo;
		 private String model;

		 public vehicle(String model){
		 numvehicle++;
		 chassisNo="ch"+ numvehicle;
		 this.model = model;
		 System.out.print("Vehicle manufactured \n");
		 }
		 public static class Engine extends vehicle{
		 public Engine(String model) {
				super(model);
			
			}

		private static final String MAKE = "Predicter";
		 private static final int CAPACITY = 1600;
		 
		 

		 public static String getMAKE() {
		 return MAKE;

		 }

		 public static int getCapacity () {
		 return CAPACITY;
		 }
		 }
		 public String getChassisNo() {
		 return chassisNo;
		 }
		 public void setChassisNo(String chassisNo) {
		 this.chassisNo = chassisNo;
		 }
		 public String getModel() {
		 return model;
		 }
		 public void setModel(String model) {
		 this.model = model;
		 }

		 public  String toString() {
		 return "\nThe vehicle is manufactured by: " + vehicle.MAKE
		 +"\nThe model type is " + this.model
		 +"\nthe chassis number is " + chassisNo
		 +"\nThe engine make is" + Engine.getMAKE()
		 +"\nThe engine capacity is" + Engine.getCapacity();

		 

		 }
}
