package flowControl;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = sc.nextInt();
		FloydsFormat ff = new FloydsFormat();
		System.out.print(ff.pattern(lines));
		sc.close();
	}
}
