import java.util.Date;

public class ContractEmployee extends Employee {
	private Contractor contr;
	
	public ContractEmployee(String firstName, String lastName, double salary, String grade, Date joinDate, Contractor contr ){
		super(firstName, lastName, salary, grade, joinDate);
		setContr(contr);
	}
	

	public void setContr(Contractor contr) {
		this.contr = contr;
	}


	public static int contractEmpCount=0;
	{
		contractEmpCount = contractEmpCount + 1;
	}
	
	public void setSalary(double hours, double rate){
		setSalary(hours * rate);
	}

	public Contractor getContr() {
		return contr;
	}

	public void setContr(String firstName, String lastName) {

	
	}
	
	
	
	


	
}
