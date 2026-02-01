package flowControl;

class PositiveOrNegativeNumber {
	public String numberCheck(int num) {
		if(num>0) {
			return "positive";
		}
		else if(num<0) {
			return "negative";
		}
		else {
			return "zero";
		}
		
	}
}