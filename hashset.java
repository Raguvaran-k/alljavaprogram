package Data;

import java.util.HashSet;
import java.util.Scanner;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter the number");
	      String  ram=sc.nextLine();
		HashSet<String> w=new HashSet<String>();
	for(int i=0;i<=ram.length();i++){
		w.add(ram);
	}
		      System.out.println(w);

	}
	}



