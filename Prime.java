package Data;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=1;
		int n=4;
		//m=n/2;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				//System.out.println("m+"+" "+"is not a prime number");
				prime=0;
			
				break;
			}
			}
		
	if(prime==1) {
		System.out.println(n+ "-is a prime number");
	}
		

	}

}
