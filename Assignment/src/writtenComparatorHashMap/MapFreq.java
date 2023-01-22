package writtenComparatorHashMap;
import java.util.ArrayList;
import java.util.HashMap;
// Create HashMap which contain String as key and Integer as value key is name of city and value is frequency of that city;
public class MapFreq {
	
	    public static void main(String args[]) {
	    	
	        ArrayList<String> al=new ArrayList<>();
	        al.add("pune");
	        al.add("Mumbai");
	        al.add("pune");
	        al.add("Mumbai");
	        al.add("Nasik");
	        al.add("pune");
       
	        System.out.println(al);
	        
	       HashMap<String, Integer> hm=new HashMap<>();
	        
	       for(String str:al)
	        {
	            if(hm.containsKey(str))
	            {
	                int i=hm.get(str);
	                    i=i+1;
	                hm.put(str, i);
	            }
	            else
	            {
	                hm.put(str, 1);
	            }
	        }
	        
	        System.out.println(hm);
	    }
	}
