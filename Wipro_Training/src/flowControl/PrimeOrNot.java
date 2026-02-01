package flowControl;

public class PrimeOrNot {
	public String prime(int num) {
		if(num%2==0 || num%3==0 || num%5==0 || num%7==0) {
			return "Not a prime";
		}
		else {
			return "Is prime";
		}
	}
}
