import java.time.LocalDate;

public class RailwayReservation extends Reservation{
	private int seatNo;

	public RailwayReservation(String id, String name, LocalDate date,int seatNo) {
		super(id, name, date);
		this.seatNo=seatNo;
	}
	
	public void checkReservationStatus() {
		super.checkReservationStatus();
		System.out.println("SeatNo: "+seatNo);
	}
	
	public void modifyReservation(String newName,LocalDate newDate,int newSeatNo) {
		super.modifyReservation(newName, newDate);
		this.seatNo=newSeatNo;
		System.out.println("Seat no updated");
	}
	
	public int getSeatNo() {
		return seatNo;
	}

}
