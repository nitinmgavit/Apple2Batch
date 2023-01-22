package writtenComparatorHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner; 

// 4. There is a linked list which contains numbers from 1 to 5 . { 1,4,2,1,3,1,4} . 
// Create a map which contains string which is number in words and number of times that number has appeared in list?
// E.g. output map for above list will be map { (“one”, 3) ,(“two”, 1),(“three” , 1),(“four”, 2)}. 
// Make use of switch statement to get number in words.

public class MapExample {

	public static void main(String args[]) {
        
        LinkedList<String> al=new LinkedList<>();
        al.add("1");
        al.add("4");
        al.add("2");
        al.add("1");
        al.add("3");
        al.add("1");
        al.add("4");

        Scanner sc=new Scanner(System.in);
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
        
        HashMap<String, Integer> hm1=new HashMap<>();
        
        System.out.println("1) For One\n" + "2) For Two\n" + "3) For Three\n" + "4) For Four\n" + "5) For Five\n");
        System.out.println("Enter the choice:");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
                if(hm.containsKey("1"))
                {
                    hm1.put("One", 3);
                }
            System.out.println(hm1);
            
            break;
            case 2:
                if(hm.containsKey("1"))
                {
                    hm1.put("Two", 1);
                }
            System.out.println(hm1);
            
            break;
            case 3:
                if(hm.containsKey("1"))
                {
                    hm1.put("Three", 1);
                }
            System.out.println(hm1);
            
            break;
            case 4:
                if(hm.containsKey("1"))
                {
                    hm1.put("Four", 2);
                }
            System.out.println(hm1);
            
            break;
            
            default:
                System.out.println("Plese Enter Valid Choice");
        }
        
    }
}
