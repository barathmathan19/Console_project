import java.time.LocalDate;

public class ResortReservation extends Reservation{
	private int roomNo;

	public ResortReservation(String id, String name, LocalDate date, int roomNo) {
		super(id, name, date);
		this.roomNo=roomNo;
	}
	
	public void checkResevationStatus() {
		super.checkReservationStatus();
		System.out.println("RoomNo: "+roomNo);
	}
	
	public void modifyReservation(String newId,String newName,LocalDate newDate,int newRoomNo) {
		super.modifyReservation(newName,newDate);
		this.roomNo=newRoomNo;
		System.out.println("Room number modified");
	}
	
	public int getRoomNo() {
		return roomNo;
	}

}
