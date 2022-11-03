package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.sound.midi.SysexMessage;

public class Customerdetail {
	private String Name;
	private String Location;

	public void setName(String name) {
		this.Name = name;
	}

	public String getName() {
		return this.Name; 
	}

 	public void setLocation(String location) {
		this.Location = location;
	}

	public String getLocation() {
		return this.Location;
	}

	public Customerdetail(String name, String location) {
		Name = name;
		Location = location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customerdetail> customers = new ArrayList<>();
		customers.add(new Customerdetail("ragu", "thanjavur"));
		customers.add(new Customerdetail("kannan", "orathanadu"));
		customers.add(new Customerdetail("ramkumar", "thanjavur"));
		customers.add(new Customerdetail("premkumar", "vallam"));
		customers.add(new Customerdetail("ramesh", "orathanadu"));
		HashMap<String, Integer> customercount = new HashMap<>();
		for (Customerdetail i : customers) {
			Integer customerscount = customercount.get(i.getLocation());
			if (null== customerscount) {
				customerscount = 1;
			} else {
				customerscount++;
			}
			customercount.put(i.getLocation(), customerscount);
		}
		System.out.println(customercount);
	}
}
