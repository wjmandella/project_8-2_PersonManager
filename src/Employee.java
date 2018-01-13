
public class Employee extends Person {
	
	private String ssn;
	
	public Employee() {
		super();
	}

	public Employee(String first, String last, String ssn) {
		super();
		setFirstName(first);
		setLastName(last);
		setSsn(ssn);	
	}
	
	public String getSsn() {
	    return "xxx-xx-" + ssn.substring(ssn.length() - 4);
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		String employee = super.toString();
		return employee + "\n" + "SSN: " + getSsn();
	}
}
