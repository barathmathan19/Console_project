import java.util.*;

class Taxi{
	int id;
	int locationIdx;
	int freeAt;
	int totalEarning;
	
	List<Booking> Bookings;
	
	public Taxi(int id) {
		this.id=id;
		this.locationIdx=0;
		this.freeAt=0;
		this.totalEarning=0;
		this.Bookings = new ArrayList<>();
	}
	
	boolean canReachBy(int pickupIdx, int pickupTime) {
		int travelToPickupHours = Math.abs(locationIdx-pickupIdx);
		int arrivalTime = Math.max(freeAt,0) + travelToPickupHours;
		return arrivalTime <= pickupTime;
	}
}
