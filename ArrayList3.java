package Data;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList v=new ArrayList();
		v.add("bala");
		v.add("bala");

		v.add("arun");
		v.add(23);
		v.add(78);
		v.add(78);
		System.out.println(v);
		ArrayList s=new ArrayList();
		s.add("thiru");
		s.add("raja");
		s.add(19);
		s.add("thiru");
		System.out.println(s);
		s.addAll(v);
		System.out.println(s);
		s.addAll(0, v);
		System.out.println(s);
		v.retainAll(s);
		System.out.println(v);
		System.out.println("thiru's first position of"+s.indexOf(23));
		System.out.println("thiru's last position of"+s.lastIndexOf("thiru"));
			}

		


	

}
