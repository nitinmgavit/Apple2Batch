package writtenComparatorHashMap;

public class Profile {
	String state;
	String country;

	public Profile(String state, String country) {
		this.state = state;
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return state + " " + country;
	}
	

}
