package Data;

public class Kbs {
	private String name;
	private String fathername;
	private String mothername;
	private double monthlysalary;
	private long mobile;
	private static String email;

	public  Kbs() {
		
	}
	
	private Kbs(String name,String fathername,String mothername,double monthlysalary,long mobile,String email) {
		this.name=name;
		this.fathername=fathername;
		this.mothername=mothername;
		this.monthlysalary=monthlysalary;
		this.mobile=mobile;
		this.email=email;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kbs varan=new Kbs("ragu","kri","mala",25000.00,9585252723l,"ragu8214@gmail.com");
		//Kbs sathi=new Kbs();
		//sathi.name="ramkumar";
		//sathi.fathername="raja";
		//sathi.mothername="malathi";
		//sathi.monthlysalary=21000.00;
		///sathi.mobile=6383197392l;
		///sathi.email="ragu141@gmail.com";
		//System.out.print(varan.name+"  "+varan.fathername+"   "+varan.mothername+"  "+varan.monthlysalary+"  "+varan.mobile+"  "+varan.email);
	}

}


