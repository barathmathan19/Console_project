package flowControl;

public class FloydsFormat {
	public String pattern(int lines) {
		for(int i=0;i<lines;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return "";
	}
}
