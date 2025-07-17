package flowControl;

public class MonthName {
	public static void main(String[] args) {
		int sum=0;
		String month = "";
		if(args.length>0) {
			for(int i=0;i<args.length;i++) {
				sum+=Integer.parseInt(args[i]);
			}
			switch(sum) {
			case 1: month="Jan"; break;
			case 2: month="Feb"; break;
			case 3: month="Mar"; break;
			case 4: month="Apr"; break;
			case 5: month="May"; break;
			case 6: month="Jun"; break;
			case 7: month="Jul"; break;
			case 8: month="Aug"; break;
			case 9: month="Sep"; break;
			case 10: month="Oct"; break;
			case 11: month="Nov"; break;
			case 12: month="Dec"; break;
			}
		}
		else {
			System.out.println("Enter a argument!");
		}
		
	}
}
