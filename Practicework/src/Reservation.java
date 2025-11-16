import java.time.LocalDate;

public class Reservation {
	private String id;
	private String name;
	private LocalDate date;
	
	public Reservation(String id, String name, LocalDate date) {
		this.id=id;
		this.name=name;
		this.date=date;
	}
	
	public void checkReservationStatus() {
		System.out.println("Reservation ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Date: "+date);
		System.out.println("Status: Confirmed");
	}
	
	public void modifyReservation(String newName, LocalDate newDate) {
		this.name=newName;
		this.date=newDate;
		System.out.println("Reservation modified");
	}
	//id
	public String getId() {
		return id;
	}
	//name
	public String getName() {
		return name;
	}
	//date
	public LocalDate getDate() {
		return date;
	}
}
