package lot;

import java.util.*;

public class ParkingLot {
	private List<ParkingSlot> slots;
	
	public ParkingLot(int totalSlots) {
		slots = new ArrayList<>();
		for(int i=1;i<=totalSlots;i++) {
			slots.add(new ParkingSlot(i));
		}
	}
	
	public boolean parkCar(Car car) {
		for(ParkingSlot slot : slots) {
			if(slot.isFree()) {
				slot.parkCar(car);
				System.out.println("Car parked at slot: "+ slot.getSlotNumber());
				return true;
			}
		}
		System.out.println("Parking lot is full!");
		return false;
	}
	
	public boolean removeCar(String carNumber) {
		for(ParkingSlot slot : slots) {
			if(!slot.isFree() && slot.getCar().getCarNumber().equals(carNumber)) {
				slot.removeCar();
				System.out.println("Car is removed from the slot: "+slot.getSlotNumber());
				return true;
			}
		}
		System.out.println("Car not found!");
		return false;
	}
	
	public void displayStatus() {
		for(ParkingSlot slot : slots) {
			if(slot.isFree()) {
				System.out.println("Slot "+ slot.getSlotNumber()+ " is free.");
			}
			else {
				System.out.println("Slot "+slot.getSlotNumber()+" is occupied by "+slot.getCar().getCarNumber());
			}
		}
	}
}
