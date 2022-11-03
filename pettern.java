package Data;

public class pettern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	
	int n1=9;
	for(int i=1;i<=n;i++) {
		for(int j=n;j>i;j--) {
			System.out.print(" * ");
		}

	System.out.println();
	}
	int n2=9;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}

int n3=9;
for(int i=0;i<=n;i++) {
	for(int j=n;j>i;j--) {
		System.out.print(" * ");
	}

System.out.println();

}
}

}
