package Data;

public class AccessModifier {
	
/*public String name;
//public String fathername;
//public String mothername;
//public double monthsalary;
//public long mobile;
//public String email;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		//AccessModifier aa=new AccessModifier();
		//aa.name="ramkumar";
		//aa.fathername="palanivel";
		//aa.mothername="indhira";
		//aa.monthsalary=23090.00;
		//aa.mobile=6383197392l;
		//aa.email="ragu8214@gmail.com";
// System.out.println(aa.name+" ,"+aa.fathername+" , "+aa.mothername+" , "+aa.monthsalary+" , "+aa.mobile+" , "+aa.email);
		

	}

}*/
	public String name;
	public String fathername;
	public String mothername;
	public double monthsalary;
	public long mobile;
	public String email;
	//private Object normalmethod;
	public static String ramstaticvariable="vembaiyen";
	public final static String ramstaticfinalvariable="elango";
	public void setname(String yourname) {
		this.name=yourname;
	}
	public String getname(){
		return this.name;
	}
	public void normalmethod() {
		System.out.println("this is normal method");
	}
	public static void staticmethod() {
		System.out.println("this is a static method");
	}
	public AccessModifier(String name,String fathername,String mothername,double monthsalary,long mobile,String email) {
		this.name=name;
		this .fathername=fathername;
		this.mothername=mothername;
		this.monthsalary=monthsalary; 
		this.mobile=mobile;
		this.email=email;
		
		
	}
	public AccessModifier() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
			AccessModifier rr= new AccessModifier();
			rr.setname("mohanraj");
			System.out.println(rr.name);
		AccessModifier mm=new AccessModifier();
		mm.normalmethod();
		AccessModifier.staticmethod();
		AccessModifier bb=new AccessModifier("kannan", "pugal", "malathi", 2354.00, 32448819808l," ragu141@gmail.com");
		System.out.println(bb.name+""+bb.fathername+""+bb.mothername+""+bb.monthsalary+""+bb.mobile+""+bb.email);
		System.out.println(ramstaticfinalvariable);
		System.out.println(ramstaticvariable);
	}
	}
