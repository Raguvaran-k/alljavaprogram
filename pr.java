package Data;

import java.util.Scanner;

public class pr {

	public static void main(String[] args) {
		// TODO Auto-generated
		 int i,m=0,prime=0;      
		  int n=4;//it is the number to be checked    
		  m=n/2;      
		 // if(n==0||n==1){  
		  // System.out.println(n+" is not prime number");      
		 // }
		   for(i=2;i<=m;i++){      
		    if(n%i==0){ 
		    	 System.out.println(n+" is not prime number");      
		         prime=1;      
		         break;      
		        }      
		       }      
		       if(prime==0)  { System.out.println(n+" is prime number"); }  
		      }//end of else  
		    }

		     
		    

		
/*int i, number = 1, count; 
		
		System.out.println(" From 1 to 100 are : ");	
		while(number <= 100)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }
		    number++;
		}
	}
		    	
}    */
   

	





	



