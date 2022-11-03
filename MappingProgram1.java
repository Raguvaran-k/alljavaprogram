package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class MappingProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb;
		int n;

					Scanner sc=new Scanner(System.in);
					
			
					System.out.println("start number");
					 numb=sc.nextInt();
					System.out.println("end number");
					n=sc.nextInt();
					
					//for(int i=numb;i<=n;i++) { 
					//	 System.out.println(i);
						//}
			
					
					
			        ArrayList<Integer> arrli= new ArrayList<Integer>();
			        
		    for (int i1 = numb; i1 <= n; i1++) {
		    	
		    
			            arrli.add(i1);
		    }
			 System.out.println("mainList="+arrli);
			 
		    
			 for(int ragu:arrli) {
				System.out.println(ragu);
			 }
		LinkedList<Integer> v=new LinkedList<Integer>();

		for(int i2 = numb; i2 <= n; i2++) {
			//v.add(i2);     //or
		if(i2%2==0) { 
			v.add(i2); //or
		}
		}
			System.out.println("even="+v);


			ArrayList<Integer> m=new ArrayList<Integer>();
			for(int i3 = numb; i3 <= n; i3++) {
			if(i3%2!=0) {
				m.add(i3);
			}
			}
			System.out.println("odd="+m);
			
			HashSet<Integer> g=new HashSet<Integer>();
			for(int i6 = numb; i6 <= n; i6++) {
				g.add(i6);
				
			}
			System.out.println("Hashset main set="+g);
			
			HashSet<Integer> w=new HashSet<Integer>();
			for(int i4 = numb; i4 <= n; i4++) {
				if(i4%2!=0) {
					w.add(i4);
				}
			}
			System.out.println("Hashset odd number="+w);
			HashSet<Integer> z=new HashSet<Integer>();
			for(int i5 = numb; i5 <= n; i5++) {
				if(i5%2==0) {
					z.add(i5);
				}
			}
			System.out.println("Hashset even number="+z);
			HashMap<Integer,Integer> u=new HashMap<Integer,Integer>();
			u.put(numb, n);
			System.out.println("hashmap"+u);
			System.out.println("finall completed");
				
				
				}
			



	}


