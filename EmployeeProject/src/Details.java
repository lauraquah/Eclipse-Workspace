
public class Details {
	
	
	public static void main(String[] args) {

		Employee first = new Employee();
		first.setFirstName("L");
		first.setGrade("AA");
		first.setJoinDate("01012018");
		
		Employee second = new Employee();
		second.setFirstName("Q");
		second.setGrade("B");
		second.setJoinDate("01042018");
		
		System.out.println(Employee.UniqueEmpID() + ", "+ first.getFirstName() + ", " + first.getJoinDate());
		
		System.out.println(Employee.UniqueEmpID() + ", "+ second.getFirstName() + ", " + second.getJoinDate());

		System.out.println("Number of Employees:" + Employee.EmpCount );
	}

}
