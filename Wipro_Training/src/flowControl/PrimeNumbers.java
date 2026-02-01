package flowControl;

public class PrimeNumbers {
	public static void main(String[] args) {
		for(int i=23;i<=57;i++) {
			if(i%2==0 || i%3==0 || i%5==0 || i%7==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
