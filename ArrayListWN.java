package Data;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWN {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList b=new ArrayList();
	b.add("ragu");
	b.add(12);
	b.add("kannan");
	b.add(45);
	b.add("vivek");
		
System.out.println("collection List:"+b);

b.set(2,"prem");
System.out.println("change the name:"+b);
b.remove(3);
System.out.println("remove the number:"+b);

	}

}
 