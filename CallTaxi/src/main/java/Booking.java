

class Booking{
	int bookingId;
	int customerId;
	char from;
	char to;
	int pickupTime;
	int dropTime;
	int amount;
	
	

	public Booking(int i, int customerId2, char pickupPoint, char dropPoint, int pickupTime2, int dropTime2, int fare) {
		// TODO Auto-generated constructor stub
	}



	public void booking(int bookingId, int customerId, char from, char to, int pickupTime, int dropTime, int amount) {
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.from = from;
		this.to = to;
		this.pickupTime = pickupTime;
		this.dropTime = dropTime;
		this.amount = amount;
	}
}