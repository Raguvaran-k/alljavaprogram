package Data;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		int a;
		int b;
	
		
		// TODO Auto-generated met67hod s
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		a=sc.nextInt();
		b=sc.nextInt();
		try {
			int c=a/b;
			System.out.println("try block");
		}catch(ArithmeticException e) {
			System.out.println("error");
		}
		
		}
		
			
		}

	
	



