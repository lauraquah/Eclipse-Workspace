import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Details {
	
	public static void main(String[] args) {
		
		
		ContractEmployee first = new ContractEmployee();
		first.setFirstName("L");
		first.setGrade("AA");
		first.setJoinDate(01, 01, 2018);
		first.setSalary(2, 30.5);
		//first.contractor("cont");
		first.setContractorName("nn");
		System.out.println("The salary is: " + first.getSalary() + ", " + first.getContractorName());
	
		PermanentEmployee second = new PermanentEmployee();
		second.setFirstName("Q");
		second.setGrade("B");
		second.setJoinDate(01, 01, 2018);

		
		System.out.println(Employee.UniqueEmpID() + ", "+ first.getFirstName() + ", " + first.getJoinDate() + ", " + first.getSalary());
		
		System.out.println(Employee.UniqueEmpID() + ", "+ second.getFirstName() + ", " + second.getJoinDate());

		System.out.println("Number of Employees:" + Employee.EmpCount );
		
		System.out.println("Contract Employee Counter: " + ContractEmployee.contractEmpCount);
		
		System.out.println("Permanent Employee: " + PermanentEmployee.permEmpCount);
	}



}

