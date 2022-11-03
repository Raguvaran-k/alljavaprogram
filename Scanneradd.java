package Data;

import java.util.Scanner;

public class Scanneradd {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		 n=sc.nextInt();
	 System.out.println("odd"+" "+"even");
	 for(int i=0;i<=n;i++) {
		 if(i%2!=0) {
			 
		
	 System.out.println(i);
			 }
		 else {
			 System.out.print(i+" ");
			 }
 
			 
		 }
		
	}

}

