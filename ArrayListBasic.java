package Data;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList w=new ArrayList();
		w.add("kannan");
		w.add("malar");
		w.add(25);
		w.add(11);
		w.add("kannan");
System.out.println("w values:"+w);
		System.out.println("w size:"+w.size());
		System.out.println("w contains:"+w.contains("malar"));
  w.add(2,"veera");
  System.out.println("w set value:"+w);
  ArrayList n=new ArrayList();
  System.out.println("n values is emty:"+n);
  n.addAll(w);
  System.out.println("w values is add n:"+n);
  n.clear();
  System.out.println("n value is clear:"+n);
  n.add(100);
  n.add(200);
  n.add(300);
  n.addAll(w);
  System.out.println(n);
  n.addAll(0,w);
  System.out.println(n);
  System.out.println(w.get(3));
  System.out.println(w.indexOf(11));
  System.out.println(n.isEmpty());
  System.out.println("kannan.first position"+w.indexOf("kannan"));
  System.out.println("kannan.second position"+w.indexOf("kannan"));
  System.out.println(w.remove(0));
  System.out.println(w.remove("kannan"));
  n.removeAll(w);
  System.out.println(n);
  n.retainAll(w);
 System.out.println(n);
 w.set(1, "abcd");
 System.out.println(w);
List n1=w.subList(1, 5);
 System.out.println(n1);
	}




	}


