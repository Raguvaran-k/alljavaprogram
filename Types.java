package Data;

public class Types {
	int a=30;//instance
	static int b=45;//static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int c=9;//local variable
		Types three=new Types();
		System.out.println("a:"+three.a);//instance variable
		System.out.println("b:"+b);//static variable
		System.out.println("c:"+b );//local variable

	}

}
