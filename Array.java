package Data;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] mark=new int[7];
		int[] mark1= {12,34,56,78,21,67,55};
	//for(int i=mark1.length-1;i>=0;i--) {
		//System.out.println(mark1[i]);
       System.out.println(mark1.length);
	}
		 

	}*/
		 Integer[] intArray = {10,20,30,40,50,60,70,80,90};
	     
		  //print array starting from first element
		    System.out.println("Original Array:");
		    for(int i=0;i<intArray.length;i++)
		         System.out.print(intArray[i] + "  ");
		     
		    System.out.println();
		     
		    //print array starting from last element
		    System.out.println("Original Array printed in reverse order:");
		         for(int i=intArray.length-1;i>=0;i--)
		         System.out.print(intArray[i] + "  ");
		    }
		}





