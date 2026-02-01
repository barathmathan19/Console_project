import java.util.*;

public class StudentManagement {
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, Student> studentMap = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
            case 1: addStudent(); break;
            case 2: viewAll(); break;
            case 3: searchStudent(); break;
            case 4: updateStudent(); break;
            case 5: deleteStudent(); break;
            case 6: System.out.println("Exiting..."); break;
            default: System.out.println("Invalid choice!");
        }
            
		}while(choice!=6);
		
		
	}
	static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        List<Integer> marks = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter mark " + i + ": ");
            marks.add(sc.nextInt());
        }
        studentMap.put(id, new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    static void viewAll() {
        if (studentMap.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : studentMap.values()) {
                s.display();
                System.out.println("-------------------------");
            }
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        Student s = studentMap.get(id);
        if (s != null) {
            s.display();
        } else {
            System.out.println("Student not found.");
        }
    }

    static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        Student s = studentMap.get(id);
        if (s != null) {
            sc.nextLine();
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            List<Integer> marks = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter new mark " + i + ": ");
                marks.add(sc.nextInt());
            }
            studentMap.put(id, new Student(id, name, marks));
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        if (studentMap.remove(id) != null) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

}
