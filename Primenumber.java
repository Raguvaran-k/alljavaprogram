package Data; 

public class Primenumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int m=0,prime=1;
		int n=4;
		//=n/2;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
		System.out.println(n+"it is not a pime number");
		prime=0;
		break;
		
			
			}
		}
		if(prime==1) {
			System.out.println(n+"its a prime number ");
		}

	}

}
