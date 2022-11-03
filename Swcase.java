package Data;

import java.util.Scanner;

public class Swcase {

	private static final String Sytem = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
		int marks=sc.nextInt();
		
switch(marks) {
case 45:
System.out.println("tamil");
//break;
case 35:
	System.out.println("eng");
	//break;
case 56:
	System.out.println("evs");
	//break;
case 67:
	System.out.println("pom");
	
	break;
case 65:
	System.out.println("sci");
	break;
case 34:
	System.out.println("soci");
	break;
	default:
		System.out.println("to not mension the number and subject");
}
	}

}
