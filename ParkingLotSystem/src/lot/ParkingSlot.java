package lot;

public class ParkingSlot {
	private int slotNumber;
	private Car car;
	
	public ParkingSlot(int slotNumber) {
		this.slotNumber=slotNumber;
	}
	
	public boolean isFree() {
		return car == null;
	}
	
	public void parkCar(Car car) {
		this.car=car;
	}
	
	public void removeCar() {
		this.car=null;
	}
	
	public Car getCar() {
	    return car;
	}

	
	public int getSlotNumber() {
		return slotNumber;
	}
}
