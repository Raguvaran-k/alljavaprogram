package Data;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray={1,3,4,2,12,10,8,7,6,5,9,14} ;
		ArrayList<Integer>evenList = new ArrayList<Integer>();
		ArrayList<Integer>oddList = new ArrayList<Integer>();

		for(int i=0;i<myArray.length;i++){
		if(myArray[i]%2==0){
		evenList.add(myArray[i]);
		}else{
		oddList.add(myArray[i]);
		}
		}
		//Collections.sort(evenList);
		//Collections.sort(oddList);
		for(int even : evenList)
		System.out.println("even:"+even+",");
		for(int odd : oddList)
		System.out.println(odd+",");

		}

		

	}


