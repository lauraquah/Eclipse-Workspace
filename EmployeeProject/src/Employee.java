
class Employee {

	public static int EmpCount=0;
	public int EmpID;

	private String FirstName;
	private String LastName;
	private int Salary;
	private String Grade;
	private String JoinDate;
	
	//method to get unique ID
	public static int UniqueEmpID(){
		EmpCount = EmpCount + 1;
		return EmpCount;
	}
	
	public int GetID(){
		return EmpID;
	}
		
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}

	public static int getEmpCount() {
		return EmpCount;
	}

	public int getEmpID() {
		return EmpID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getSalary() {
		return Salary;
	}

	public String getGrade() {
		return Grade;
	}

	public String getJoinDate() {
		return JoinDate;
	}

	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public void setSalary(int Salary){
		this.Salary = Salary;
	}
	public void setGrade(String Grade){
		this.Grade = Grade;
	}
	public void setJoinDate(String JoinDate){
		this.JoinDate = JoinDate;
	}
	

}
