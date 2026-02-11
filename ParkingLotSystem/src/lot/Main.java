package lot;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(5);

        while (true) {
            System.out.println("\n1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Display Status");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter car number: ");
                    String carNumber = sc.nextLine(); // ✅ allows spaces
                    parkingLot.parkCar(new Car(carNumber));
                    break;

                case 2:
                    System.out.print("Enter car number to remove: ");
                    String removeCar = sc.nextLine();
                    parkingLot.removeCar(removeCar);
                    break;

                case 3:
                    parkingLot.displayStatus();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
