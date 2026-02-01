package flowControl;

public class SameLastDigit {
	public boolean digitCompare(int num1,int num2) {
		while(num1>0 && num2>0) {
			num1=num1%10;
			num2=num2%10;
			break;
		}
		if(num1==num2) {
			return true;
		}
		else {
			return false;
		}
	}
}
