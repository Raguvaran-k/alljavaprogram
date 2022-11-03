package Data;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Task2 {
	
	

	String Name;
    String Area;
    String Location;
    
    public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getArea() {
		return Area;
	}



	public void setArea(String area) {
		Area = area;
	}



	public String getLocation() {
		return Location;
	}



	public void setLocation(String location) {
		Location = location;
	}


 public Task2(String name,String area,String location) {
    super();    
        Name=name;
        Area=area;
        Location=location;
    }



   public static <Userobj> void main(String[] args) {
        // TODO Auto-generated method stub
        
        List<Task2>dis=new ArrayList<Task2>();
        
		
		  dis.add(new Task2("ayyampettai","Thirupunam","1"));
		  dis.add(new Task2("ayyampettai","vadakkur","1"));
		  dis.add(new Task2("thanjavur","annanagar","1"));
		/*		  
		  UserObject("Name","KovilPatti","AyyamPettai",1)); dis.add(new
		  UserObject("Name","Papanadu","PattuKottai",2)); dis.add(new
		  UserObject("Name","Palathale","PattuKottai",1)); dis.add(new
		  UserObject("Name","Surakottai","PattuKottai",1)); dis.add(new
		  UserObject("Name","Ullur","Orathanadu",1)); dis.add(new
		  UserObject("Name","Vallar","Orathanadu",1)); dis.add(new
		  UserObject("Name","Ollikai","Orathanadu",1));
		   */      
        
        
        HashMap<String,HashMap<String,Integer>>district=new HashMap<String,HashMap<String,Integer>>();
        
        for(Task2 i :dis)
        {
        HashMap<String,Integer>locationmap=district.get(i.getName());
        Integer CustomerCount=0;
        if(null==locationmap)
        {
        locationmap=new HashMap<String,Integer>();
        CustomerCount=1;
        }
        else
        {
        CustomerCount=locationmap.get(i.getArea());
        if(null==CustomerCount)
        {
        CustomerCount=1;
        }
        else   
        {
        CustomerCount++;
        }
        }
        locationmap.put(i.getArea(), CustomerCount);
        district.put(i.getName(), locationmap);
        }
        System.out.println(district);
        }
        }









	
	



