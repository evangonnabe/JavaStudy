package io.epicaracer.javastudy.interfaces;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		//interface
		vehicle.run();
		
		//casting
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}
