package Data;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter your mark");
		int number;
		number=sc.nextInt();
		if(number>=67) {
			System.out.println("tamil");
		}else if(number>=60) {
			System.out.println("english");
		}else if(number>=87) {
			System.out.println("maths");
		}else if(number>=39) {
			System.out.println("social");
		}else if(number<=87) {
			System.out.println("sci");
		}
	
		}

	}


