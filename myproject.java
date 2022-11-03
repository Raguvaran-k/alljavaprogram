package Data;

import java.util.Scanner;

public class myproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("a");
		int a=sc.nextInt();
		System.out.println("b");
		int b=sc.nextInt();
		System.out.println("oddnumber");
for (int i=a;i<=b;i++) {
	if(i%2!=0) {
	System.out.println(i+" ");
	}
	System.out.println();
}
System.out.println("even number");
for(int i=a;i<=b;i++) {
	if(i%2==0) {
		System.out.println(i+" ");	
	}
	System.out.println();
}
System.out.println("accending order");
for(int i=a;i<=b;i++) {
	System.out.println(i);
}
System.out.println("decending order");
for(int i=b;i>=a;i--) {
	System.out.println(i);
	
}
Scanner ram=new Scanner(System.in);
int n,prime = 1;
//System.out.println("a");
//a=ram.nextInt();
//System.out.println("b");
//b=ram.nextInt();

System.out.println("enter a  prime number");

for(int i=a;i<=b;i++) {
	prime=1;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			prime=0;
			break;
		}
		 }
	if(prime==1) {
		System.out.println(i);
	}

		 }
	 }
			


	}



 



	












		
	
	


	



