import java.util.*;
class Student {
	    int id;
	    String name;
	    List<Integer> marks = new ArrayList<>();

	    Student(int id, String name, List<Integer> marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	    }

	    double calculateAverage() {
	        int sum = 0;
	        for (int mark : marks) {
	            sum += mark;
	        }
	        return marks.isEmpty() ? 0 : (double) sum / marks.size();
	    }

	    String calculateGrade() {
	        double avg = calculateAverage();
	        if (avg >= 90) return "A";
	        else if (avg >= 75) return "B";
	        else if (avg >= 60) return "C";
	        else if (avg >= 40) return "D";
	        else return "F";
	    }

	    void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	        System.out.println("Average: " + calculateAverage());
	        System.out.println("Grade: " + calculateGrade());
	    }
}
