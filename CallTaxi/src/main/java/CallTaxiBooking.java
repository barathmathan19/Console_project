import java.util.*;

public class CallTaxiBooking {
	static final String POINTS = "ABCDEF";
	static final int KM_PER_SEGMENT = 15;
	
	List<Taxi> taxis;
	int nextBookingId = 1;
	
	public CallTaxiBooking(int taxiCount) {
		taxis = new ArrayList<>();
		for(int i=1;i<=taxiCount;i++) {
			taxis.add(new Taxi(i));
		}
	}
	
	private int computeFare(int kms) {
		if(kms<=5) {
			return 100;
		}
		return 100+(kms-5)*10;
	}
	
	private int idxOf(char p) {
		return POINTS.indexOf(p);
	}
	
	public Taxi book(int customerId, char pickupPoint, char dropPoint, int pickupTime) {
		int pickupIdx = idxOf(pickupPoint);
		int dropIdx = idxOf(dropPoint);
		
		List<Taxi> candidates = new ArrayList<>();
		for(Taxi t : taxis) {
			if(t.canReachBy(pickupIdx, pickupTime)) {
				candidates.add(t);
			}
		}
		if(candidates.isEmpty()) {
			System.out.println("Booking rejected for customer "+ customerId + " at time " + pickupTime);
		}
		
		candidates.sort((a,b)->{
			int da = Math.abs(a.locationIdx - pickupIdx);
			int db = Math.abs(b.locationIdx - pickupIdx);
			
			if(da!=db) return Integer.compare(da,db);
			if(a.totalEarning!=b.totalEarning) return Integer.compare(a.totalEarning, b.totalEarning);
			return Integer.compare(a.id, b.id);
		});
		
		Taxi assigned = candidates.get(0);
		
		int travelPickUpToDropSegment = Math.abs(pickupIdx - dropIdx);
	    int travelHours = travelPickUpToDropSegment;
	    int kms = travelPickUpToDropSegment * KM_PER_SEGMENT;
	    int fare = computeFare(kms);
	    
	    int dropTime = pickupTime + travelHours;
	    
	    Booking booking = new Booking(nextBookingId++, customerId, pickupPoint, dropPoint, pickupTime, dropTime, fare);
	    assigned.Bookings.add(booking);

	    assigned.totalEarning+=fare;
	    
	    assigned.locationIdx=dropIdx;
	    assigned.freeAt=dropTime;
	    
	    System.out.println("Taxi can be allotted.\nTaxi-"+assigned.id + " is allotted");
	    return assigned;
	    
	}
	
	public void printTaxiDetails() {
	    for (Taxi t : taxis) {
	        System.out.println();
	        System.out.println("Taxi-" + t.id + "\tTotalEarnings: Rs. " + t.totalEarning);
	        System.out.println("BookingID\tCustomerID\tFrom\tTo\tPickupTime\tDropTime\tAmount");
	        if (t.Bookings.isEmpty()) {
	            System.out.println("(no bookings)");
	            continue;
	        }
	        for (Booking b : t.Bookings) {
	            
	            System.out.printf("%d\t\t%d\t\t%c\t%c\t%d\t\t%d\t\t%d\n",
	                              b.bookingId, b.customerId, b.from, b.to,
	                              b.pickupTime, b.dropTime, b.amount);
	        }
	    }
	}

	
	public static void main(String[] args) {
		CallTaxiBooking app = new CallTaxiBooking(4);
		
		app.book(1,'A','B',9 );
		app.book(2, 'B', 'D', 9); 
		app.book(3, 'B', 'C', 12);
		
		app.printTaxiDetails();
	}
}
