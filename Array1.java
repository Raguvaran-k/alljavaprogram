package Data;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oddArray = {1,3,5,7,9};   //array of integers
	       System.out.println("Array of odd elements:" + Arrays.toString(oddArray));
	         
	      int[] intArray = new int[10];
	      for(int i=0;i<10;i++){       //assign values to array
	       intArray[i] = i+1;
	       }       
	      System.out.println("Array of Integer elements:" + Arrays.toString(intArray));
	    }


		}

	/*double[] d_Array = new double[10];  //array of doubles
	for(int i=0;i<10;i++){
	    d_Array[i] = i+1.12;     //assign values to double array
	}
	//print the array
	System.out.println("Array of double elements:" + Arrays.toString(d_Array));
	}
	}*/
	//char[] vowel_Array = {'a', 'e', 'i', 'o', 'u'};     //character array of vowels
	//System.out.println("Character array containing vowels:");
	////print the array
	//for (int i=0; i<vowel_Array.length; i++) {
	//   // System.out.print(vowel_Array[i] + " ");
//		        ////or
//		System.out.println(Arrays.toString(vowel_Array));
	//}
	//}
	//}




