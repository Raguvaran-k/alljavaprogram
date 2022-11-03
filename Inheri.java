package Data;

class animal4{
	public void eat() {
		System.out.println(" can eat");
	}
	
	}
class dog1 extends animal4{
	public void eat() {
		super.eat();
		System.out.println(" can eat dog");
	}
	public void bark() {
		System.out.println("can bark");
	}
}
class cat extends animal4{
	public void eat() {
		//super.eat();
		System.out.println(" can eat cat");
	}
	public void run() {
		System.out.println(" can run");
	}
}
	

public class Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog1 d=new dog1();
		d.eat();
		d.bark();

		cat c=new cat();
       c.eat();
        c.run();
	}

}





