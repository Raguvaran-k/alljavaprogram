package Data;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
        names .add("ragu");
        names .add("kannan");
        names .add("prem");
        names .add("dharan");
        System.out.println("names="+names);
        Collections.sort(names);
        System.out.println(names);
        names.remove(0);
        System.out.println(names);      
        names.set(2, "pradeep");
        System.out.println(names);
       
      
        
	}
	



	}


