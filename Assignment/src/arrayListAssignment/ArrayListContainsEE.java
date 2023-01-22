package arrayListAssignment;

import java.util.ArrayList;

public class ArrayListContainsEE {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<>();
		al.add("peek");
		al.add("seek");
		al.add("beak");
		al.add("veer");
		al.add("tree");
		
        System.out.println(al);
		
		for(String str: al)
		{
			if(str.contains("ee"))
			{
				System.out.println(str);
			}
		}
	}

}
