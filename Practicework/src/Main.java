import java.time.LocalDate;
public class Main {
  
  public static void main(String[] args) {
	 RailwayReservation rail = new RailwayReservation("B001","Barath",LocalDate.now(),201);
	 
	 rail.checkReservationStatus();
	 System.out.println();
	 
	 ResortReservation resort = new ResortReservation("R001","Barath",LocalDate.now(),101);
	 resort.checkReservationStatus();
	 
  }
} 
