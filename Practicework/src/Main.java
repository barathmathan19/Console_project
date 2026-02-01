import java.time.LocalDate;
public class Main {
  
  public static void main(String[] args) {
	 RailwayReservation rail = new RailwayReservation("B001","Barath",LocalDate.now(),201);
	 
	 rail.checkReservationStatus();
	 System.out.println();
	 
	 ResortReservation resort = new ResortReservation("R001","Barath",LocalDate.now(),101);
	 resort.checkReservationStatus();
	 System.out.println();
	 
	 rail.modifyReservation("binushya", LocalDate.of(2025, 11, 18));
	 rail.checkReservationStatus();
	 System.out.println();
	 
	 resort.modifyReservation("binushya", LocalDate.of(2025, 11, 18));
	 
	 
	 resort.checkReservationStatus();
  }
} 
