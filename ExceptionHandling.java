package Data;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	           
	            // creating an object
	            Object o = new Object();
	           
	            // type casting the object o to string which
	            // give the classcasted exception because we
	            // type cast an parent type to its child type.
	            String s = (String)o;
	           
	            System.out.println(s);
	        }
	        catch (ClassCastException e) {
	            System.out.println(e);
	        }
	    }
	}
//	int[] a=new int[5];
//	
//		
//	
//		try {
//		for(int i=0;i<=13;i++) {
//			a[i]=1000;
//		}
//	
//		}finally {
//			System.out.println("ragu");
//		}
//		
//		
//
//	}
//
//}
