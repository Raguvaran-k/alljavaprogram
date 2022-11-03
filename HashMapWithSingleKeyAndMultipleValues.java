package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapWithSingleKeyAndMultipleValues {
	public static void main(String[] args) {
		
		 Map<String, List<String>> topContriesOfContinent =
	                new HashMap<String, List<String>>();
	 
	 
	        // 1.1 create List 1
	        List<String> orathanadu =
	                new ArrayList<String>();
	 
	 
	        // 1.1.1 add top countries of Asian continent
	        orathanadu.add("ragu");
	       orathanadu.add("ram");
	       orathanadu.add("pradeep");
	        orathanadu.add("kannan");
	 
	 
	        // 1.2 create List 2
	        List<String> chennai =
	                new ArrayList<String>();
	 
	 
	        // 1.2.1 add top countries of African continent
	        chennai.add("Libya");
	     chennai.add("Mauritius");
	        chennai.add("Gambia");
	        chennai.add("Kenya");
	 
	 
	        // 1.3 create List 3
	        List<String> thanjavur =
	                new ArrayList<String>();
	 
	 
	        // 1.3.1 add top countries of African continent
	        thanjavur.add("rms");
	        thanjavur.add("annanagar");
	        thanjavur.add("junction");
	        thanjavur.add("");
	 
	 
	        // 1.4 put list to Map
	        topContriesOfContinent.put("orathanadu", orathanadu);
	        topContriesOfContinent.put("chennai",chennai);
	        topContriesOfContinent.put("thanjavur", thanjavur);
	 
	 
	 
	        // 1.5 iterate and print to console
	        System.out.println("HashMap with Single Key and Multiple Values : \n");
	        topContriesOfContinent.forEach(
	                (key,value) -> System.out.println("Key (location) : " + key 
	                        + "\n\t Values (location) : " + value)
	                
	                );
	    }
	
	
	}

