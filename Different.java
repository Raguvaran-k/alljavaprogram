package Data;

import java.util.Arrays;
import java.util.Collections;

public class Different {

	
		// TODO Auto-generated method stub
//		static void reverse(Integer myArray[]) 
//	    { 
//	        Collections.reverse(Arrays.asList(myArray)); 
//	        System.out.println("Reversed Array:" + Arrays.asList(myArray)); 
//	    } 
//	
//	     public static void main1(String[] args) 
//	    { 
//	        Integer [] myArray = {1,3,5,7,9}; 
//	        System.out.println("Original Array:" + Arrays.asList(myArray));
//	        reverse(myArray); 
//	    
//
//
//	}
	 static void reverse(String myArray[])
	    {
	        Collections.reverse(Arrays.asList(myArray));
	        System.out.println("Reversed Array:" + Arrays.asList(myArray));
	    }
	 
	     public static void main(String[] args)
	    {
	        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
	        System.out.println("Original Array:" + Arrays.asList(myArray));
	        reverse(myArray);
	    }
	}
