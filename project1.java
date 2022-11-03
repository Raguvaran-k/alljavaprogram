package Data;

import java.util.ArrayList;
import java.util.Scanner;

public class project1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
System.out.println("enter your number");
	    int start = scan.nextInt();
	    int end = scan.nextInt();

	    if(start < end)
	        for(int i = start; i <= end; i++)
	            System.out.print(i + " ");

	    else if(start > end)
	        for(int i = start; i >= end; i--)
	            System.out.print(i + " "); */
		 public static void main(String[] args) {
		        ArrayList<Integer> even = new ArrayList<Integer>();
		        ArrayList<Integer> odd = new ArrayList<Integer>();

		        int[]number=new int[10];
		        Scanner read = new Scanner (System.in);

		        System.out.print("Enter number :" );

		        for(int i=0;i<number.length;i++){
		            number[i]=read.nextInt(); 

		            if(number[i]%2==0){
		                even.add(number[i]);  
		                System.out.println("Even number is " + even);
		            }
		            else{
		                odd.add(number[i]);
		                System.out.println("Odd number is " + odd);
		            }
		        }   

		}

	


	}


