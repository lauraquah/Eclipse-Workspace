import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Details {

	public static void main(String[] args) {

		Employee[] emp = new Employee[6];

		// System.out.println("The salary is: " + first.getSalary() + ", " +
		// first.getContractorName());

		PermanentEmployee first = new PermanentEmployee("F", "Last", 10000, "aa", new Date());
		PermanentEmployee second = new PermanentEmployee("F", "Last", 10000, "aa", new Date());
		PermanentEmployee third = new PermanentEmployee("F", "Last", 10000, "aa", new Date());
		PermanentEmployee fourth = new PermanentEmployee("F", "Last", 10000, "aa", new Date());
		PermanentEmployee fifth = new PermanentEmployee("F", "Last", 10000, "aa", new Date());
		ContractEmployee sixth = new ContractEmployee("Q", "LL", 3000, "BB", new Date(),
				new Contractor("ContrName", "ContrLastName", 1000));

		emp[0] = first;
		emp[1] = second;
		emp[2] = third;
		emp[3] = fourth;
		emp[4] = fifth;
		emp[5] = sixth;

		int searchEmp = 3;
		int resultEmp = -1;
		boolean foundEmp = false;

		try {
			for (int i = 0; i < emp.length && !foundEmp ; i++) {
				if (searchEmp == emp[i].getEmpID()) {
					resultEmp = i;
					foundEmp = true;
				}
			}

			if (resultEmp != -1) {
				System.out.println("Found : " + emp[resultEmp]);
			} else {
				throw new EmployeeNotFoundException("Employee not found");
			}
		} catch (EmployeeNotFoundException e) {
			System.out.print(e.getMessage());
		}

		// System.out.println(Employee.UniqueEmpID() + ", "+
		// first.getFirstName() + ", " + first.getJoinDate() + ", " +
		// first.getSalary());

		System.out.println("name of first employee: " + first);
		System.out.println("Number of Employees:" + Employee.EmpCount);

		System.out.println("Contract Employee Counter: " + ContractEmployee.contractEmpCount);

		System.out.println("Permanent Employee: " + PermanentEmployee.permEmpCount);

	}

}
