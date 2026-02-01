package Oops;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee[] myObj = new Employee[3];
		
		for(int i=0;i<myObj.length;i++) {
				myObj[i]= new Employee();
				System.out.println("Enter ID:");
				myObj[i].setEmpid(sc.nextInt());
				
				System.out.println("Enter NAME:");
				myObj[i].setEmpname(sc.next());
				
				System.out.println("Enter ACC NO:");
				myObj[i].setEmpaccno(sc.nextInt());
		}
		System.out.println(Arrays.toString(myObj));
	}

}
