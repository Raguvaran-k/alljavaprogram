package Data;

interface fruits{
	void name();
}
interface flower{
	void name1();
	
}
class butterfly implements fruits,flower{

	
	public void name() {
		System.out.println("my name is dog");
	}
	public void name1() {
		System.out.println("my name is roja");
		
		// TODO Auto-generated method stub 
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		butterfly devi =new butterfly();
		butterfly devi2 =new butterfly();
		
		devi.name1();
		devi2.name();

	}

}
