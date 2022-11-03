package Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Main { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		 ArrayList name1 = new ArrayList();
         name1.add(46);
         name1.add(2);
         name1.add(10);
         name1.add(3);
         Collections.sort(name1);
         System.out.println (name1);
          name1.set(0,"opel");
         System.out.println (name1);
         System.out.println (name1);
//          name1.remove(0);
//         System.out.println (name1);
  
 
                 
		 LinkedList a = new LinkedList();
a.addAll(name1);
		 	 System.out.println(a);
		 	 
		 	 
		 	 
	}

}

