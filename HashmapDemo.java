package Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashmapDemo {

	private static final char[] EXPress = null;

	//private static Iterator s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> ram=new HashMap<String, Integer>();
		ram.put("nellai EXP", 1900);
		ram.put("Mannai EXP", 2000);
		ram.put("Mumbai", 2100);
		ram.put("vaigai",2100);
		System.out.println(ram);
   Set s=ram.entrySet();
   System.out.println(s);
   Iterator m= s.iterator();
  while(m.hasNext())
{
	 // System.out.println(m.next());
	  Object o=m.next();
	  Map.Entry e=(Map.Entry)o;
	  Object time=e.getValue();
	  Object express=e.getKey();
	  if(time.equals(2100)) {
		  e.setValue(12.00);
		  System.out.println(s);
	 // System.out.println(express);
	 // System.out.println(e.getKey());
	//  System.out.println(e.getValue());
	}

}
}	
}
	
