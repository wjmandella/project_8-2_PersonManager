
public class Customer extends Person {
	private String customerNumber;
	
	public Customer() {
		super();
		customerNumber = "";
	}

	public Customer(String first, String last, String number) {
		super();
		setFirstName(first);
		setLastName(last);
		setCustomerNumber(number);			
	}
	
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	@Override
	public String toString() {
		String name = super.toString();
		return name + "\n" + "Customer Number: " + customerNumber;
	}
}
