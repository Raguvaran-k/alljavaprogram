package Data;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args ) {
		
		// TODO Auto-generated method stubArray
	
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("chennai", 20);
        hm.put("orathanadu", 10);
        hm.put("thanjavur" , 40);
        System.out.println(hm);
        HashMap<String,Integer> hm2=new HashMap<String,Integer>(); 
hm2.putAll(hm);
System.out.println(hm2);

System.out.println(hm2.get("thanjavur"));
hm2.containsKey("orathanadu");
System.out.println(hm2.containsKey("orathanadu"));
System.out.println(hm.containsKey("ram"));
System.out.println(hm2.containsValue(20));
System.out.println(hm2.containsValue(25));
System.out.println(hm2.remove("orathanadu"));
System.out.println(hm2);
System.out.println(hm2.remove("thanjavur",40));
System.out.println(hm2);
System.out.println(hm2.remove("orathanadu", 10));
System.out.println(hm2);
System.out.println(hm2.size());
System.out.println(hm2.isEmpty());

System.out.println(hm2);
hm2.clear();
System.out.println(hm2);

System.out.println(hm2.isEmpty());
Set s=hm.entrySet();
System.out.println(s);
Collection c =hm.values();
System.out.println(c);
Collection c1=hm.keySet();
System.out.println(c1);
Set s1=hm.entrySet();
System.out.println(s1);

}

	}



