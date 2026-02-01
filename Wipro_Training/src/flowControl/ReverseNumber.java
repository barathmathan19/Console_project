package flowControl;

public class ReverseNumber {
	public int reverse(int num) {
		int reversedNum = 0; 
		while(num>0) {
			num = num%10;
			reversedNum += (reversedNum*10) + num;
			num/=10;
		}
		return reversedNum;
	}
}
