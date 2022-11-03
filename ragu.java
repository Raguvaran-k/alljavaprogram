package Data;

public class ragu {

	public static void main(String[] args) {
		int n=48;
	
		// TODO Auto-generated method stub
		int prime=1;
		for(int i=1;i<=n;i++) {
			prime=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=0;
					break;
				}
					}if(prime==1) {
						System.out.println(i );
				
				}
			}
		}

	public static char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	}


