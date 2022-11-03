package Data;

import java.util.Stack;

public class PeopleName {
	private String name;
	private  String fathername;
	private String mothername;
	private double monthlysalary;
	private long mobile;
	private  String email;
	private char[] yourname;
	private static String namestaticvariable="karthi";
	//private static Object voidstaticmethod;
	private final static String namestaticfinalvariable="ajithkumar";
	
	public void setname(String yourname) {
		this.name=yourname;
	}
	public String getname() {
		return this.name;
	}
    public void voidnormalmethod() {
    	System.out.println("this is normal method");
    	
    }public static  void voidstaticmethod() {
    	System.out.println("this is static method");
    }
	
		

	
   
	
	
	
		
	
	
		

	public  PeopleName() {
		
	}
	
	public PeopleName(String name,String fathername,String mothername,double monthsalary,long mobile,String email) {
		this.name=name;
		this.fathername=fathername;
		this.mothername=mothername;
		this.monthlysalary=monthsalary;
		this.mobile=mobile;
		this.email=email;
		
	}


		// TODO Auto-generated constructor stub
	
	public static void main(String[] args) {
		PeopleName raja=new PeopleName();
		raja.setname("shafi");
	System.out.println(raja.name);
		// TODO Auto-generated method stub
		PeopleName kalai=new PeopleName();
		kalai.voidnormalmethod();
		PeopleName.voidstaticmethod();
	   
		PeopleName ragu=new PeopleName();
		ragu.name="ragu";
		//ragu.setname("shafi");
		ragu.fathername="krishnamoorthi";
		ragu.mothername="malarvizhi";
		ragu.monthlysalary=25000.00;
		ragu.mobile=9585252723l;
		ragu.email="ragu8214@gmail.com";
		//PeopleName kannan=new PeopleName("kannan","dhurairaj", "selvarani", 34000.00,9585252723l, "ragu141@gmail.com");
		PeopleName ram=new PeopleName("ram", "premkumar", "abinaya",25000.00, 6383197392l,"ragu8214@gmail.com");
		System.out.println(ram.name+""+ram.fathername+""+ram.mothername+""+ram.monthlysalary+""+ram.mobile+""+ram.email);
		PeopleName.namestaticvariable="pradeep static";
		
		System.out.println("static:"+namestaticvariable);
		System.out.println("final:"+namestaticfinalvariable);
		
		
		
		System.out.println(ragu.name+""+ragu.fathername+""+ragu.mothername+""+ragu.monthlysalary+""+ragu.mobile+""+ragu.email);
		
		
	
	
	}
}


