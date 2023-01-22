package writtenComparatorHashMap;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	Profile profile;
	
	public Employee() {}
	
	public Employee(int id, String name, Profile profile)
	{
		this.id=id;
		this.name=name;	
		this.profile=profile;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}	
	
	public Profile getProfile() {
        return profile;
    }

	public String toString() {
		return id+" "+name+" "+profile;
	}
	
	public int compareTo(Employee e) {
		
		if(this.name.compareTo(e.name) == 0)
		{
			if(this.id > e.id)
			     return 1;
			if(this.id < e.id)
				 return -1;
			else
				return 0;
		} 
		else
			return (this.name.compareTo(e.name));
	  }

}




/*	public int compareTo(Employee o) {

int nameCompare = this.name.compareTo(o.getName());
if(nameCompare == 0) 
{
    return this.id - o.getId();
} 
else 
{
    return nameCompare;
}        

}
*/



/*	public int compareTo(Employee o1, Employee o2)
	{
		if(o1.name > o2.name)
			return 1;
			else if (o1.name < o2.name)
				return -1;
			else
				return o1.id.compareTo(o2.id);
		
	}
	*/
	
/*	public int compareTo(Employee o) 
	{
		if(this.id<o.id)
			return -1;
		
		else if(this.id>o.id)
			return 1;
		
		else return 0;
	}
	*/
 
/*
	public int compareTo(Employee o) 
	{
		if(this.name < o.name)
			return -1;
		
		else if(this.name > o.name)
			return 1;
		
		else return 0;
	}

*/

/*	public int compareTo(Employee e) 
{
	return this.getName().compareTo(e.getName());
}
*/
	
	/*	@Override
	public int compareTo(Employee o) {
		if(this.id<o.id)
			return -1;
		
		else if(this.id>o.id)
			return 1;
		
		else return 0;
		
	}
	*/



