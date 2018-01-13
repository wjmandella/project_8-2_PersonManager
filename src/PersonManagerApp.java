import java.util.Scanner;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			String entry = ConsolePM.validateEntry(sc, "Create customer or employee?: (c/e): ", "c", "e");
			System.out.println();
			
			String fName = ConsolePM.getString("First Name: ");
			String lName = ConsolePM.getString("Last Name: ");
			
			Person p = new Person();
			String person = "";
			
			if (entry.equals("c")) {
				String custNbr = ConsolePM.getString("Customer Number: ");
				Customer c = new Customer(fName, lName, custNbr);
				p = c;
				person = "customer";
			}
			else {
				String ssn = ConsolePM.getString("SSN: ");
				Employee e = new Employee(fName, lName, ssn);
				p = e;
				person = "employee";
			}
			
			System.out.println();
			System.out.println("You entered a new " + person + ":");
			System.out.println(p.toString() + "\n");
			choice = ConsolePM.validateEntry(sc, "Continue?: (y/n): ", "y", "n");
		}
		
		System.out.println("Bye");
	}

}
