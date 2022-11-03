package Data;

import java.util.HashMap;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      HashMap hm = new HashMap();
	      hm.put("Wallet", new Integer(700));
	      hm.put("Belt", new Integer(600));
	      System.out.println("Map1 = "+hm);
	      // Create hash map 2
	      HashMap hm2 = new HashMap();
	      hm.put("Bag", new Integer(1100));
	      hm.put("Sunglasses", new Integer(2000));
	      hm.put("Frames", new Integer(800)); 
	      hm.putAll(hm2);
	      System.out.println("Map1 after copying values of Map2 = "+hm);
	   }

	}


