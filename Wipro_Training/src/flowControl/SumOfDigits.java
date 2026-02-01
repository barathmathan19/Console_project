package flowControl;

public class SumOfDigits {
	public int sum(int num) {
		int total=0;
		while(num>0) {
			num=num%10;
			total+=num;
			num/=10;
		}
		return total;
	}
}
