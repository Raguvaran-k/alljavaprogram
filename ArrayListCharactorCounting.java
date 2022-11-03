package Data;

import java.util.ArrayList;

public class ArrayListCharactorCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList  sc=new ArrayList();
		
		String sraja="ramu";
char search='m';
int count=0;
for(int i=0;i<sraja.length();i++) {
	if(search==sraja.charAt(i)) 
		count++;
	}
		System.out.println("count of"+search+"is"+count);
}
		
		


	}


