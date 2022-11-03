package Data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enTER YOUR NAME");
//		name=sc.nextLine();
//		try {
//			System.out.println(" name.charAt(23)");
//		}catch(StringIndexOutOfBoundsException e) {
//			System.out.println("String index out of bounds. String length: " + name.length());
//			
//		}
		/*String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		        try {
		        	a=sc.nextLine();
		           // String a = "this is the likechipping"; // length is 22
		            char c = a.charAt(24); // accessing 25th element
		            System.out.println(c);
		        }
		        catch (StringIndexOutOfBoundsException e) {
		            System.out.println("String index out of fount");
		        }    */
		int a;
		int b;
	
		
		// TODO Auto-generated met67hod s
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		//a=sc.nextInt();
	//	b=sc.nextInt();
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			int c=a/b;
			
			System.out.println(c);
		}catch(InputMismatchException e) {
			System.out.println("error");
		}
		
	}
	}



