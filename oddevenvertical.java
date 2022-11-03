package Data;

import java.util.Scanner;

public class oddevenvertical {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
		int n;
		
		 System.out.println("Enter the  number");
		 n=sc.nextInt();
		 
		System.out.println("even number");
		 for(int i=0; i<n;i++) 
		 {	 
			if(i%2==0) 
		 System.out.println(i+" ");
			
		 }
		 System.out.println();
		 
		 System.out.println("Odd Number");
		 
		 for(int j=0;j<n; j++)
		 {
			 if(j%2!=0)
		System.out.println(j+" ");	 
		 }
		 System.out.println();
			 
	} 
		 }
		 
		 
		 
		 
	
				
	

	