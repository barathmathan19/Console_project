package controlflow;

public class InteresetPercentage {

    public String getInterest(String gender, int age) {
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                return "The percentage of interest is 8.2%";
            } else if (age >= 59 && age <= 100) {
                return "The percentage of interest is 9.2%";
            } else {
                return "Invalid age- Female";
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                return "The percentage of interest is 8.4%";
            } else if (age >= 59 && age <= 100) {
                return "The percentage of interest is 10.5%";
            } else {
                return "Invalid age- Male.";
            }
        } else {
            return "Invalid gender.";
        }
    }
}
