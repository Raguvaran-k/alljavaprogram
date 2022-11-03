package Data;

import java.util.ArrayList;
import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> n=new ArrayList<Integer>();
//n.add(4);
//n.add(6);
//n.add(8);
//n.add(10);
//for(int i=0;i<=n.size();i++) {
//	System.out.print(i);
//}
//	}
		 Scanner scan = new Scanner(System.in);
System.out.println("start");
		    int start = scan.nextInt();
		    System.out.println("end");
		    int end = scan.nextInt();
		    ArrayList v=new ArrayList();

		    if(start < end)
		        for(int i = start; i <= end; i++)
		            System.out.print(i + " ");

		    else if(start > end)
		        for(int i = start; i >= end; i--)
		            System.out.print(i + " ");  
}
}
