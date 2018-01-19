import java.util.Date;

public class PermanentEmployee extends Employee{
	
	
	public PermanentEmployee(String firstName, String lastName, double salary, String grade, Date joinDate) {
		super(firstName, lastName, salary, grade, joinDate);
		// TODO Auto-generated constructor stub
	}
	
	public static int permEmpCount=0;
	{
		permEmpCount = permEmpCount + 1;
	}
	
	
}
