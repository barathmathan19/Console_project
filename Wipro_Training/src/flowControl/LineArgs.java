package flowControl;

public class LineArgs {
	public static void main(String[] args) {
		if(args.length>0) {
			System.out.print(args + " ");
		}
		else {
			System.out.print("No value");
		}
	}
}
