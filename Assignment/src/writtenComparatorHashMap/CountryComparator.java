package writtenComparatorHashMap;

import java.util.Comparator;

public class CountryComparator implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2)
	{
		return
				(e1.profile.country.compareTo(e2.profile.country));
	}

}
