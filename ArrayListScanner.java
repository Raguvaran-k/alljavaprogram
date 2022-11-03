
package Data;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n ;
		  
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the number");
	        n=sc.nextInt();
	        ArrayList<Integer> arrli= new ArrayList<Integer>(n);
    for (int i = 1; i <= n; i++)
	            arrli.add(i);
	 System.out.println(arrli);
	 for(int ragu:arrli) {
		 System.out.println(ragu);
	 }
	      
//	       
//	 
//	    
//	   
//	  
//	 
//	       
//	        for (int i = 0; i < arrli.size(); i++)
//	            System.out.print(arrli.get(i) + " ");
	    }
	}


