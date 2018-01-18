

import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

class Employee {

	public static int EmpCount=0;
	public int EmpID;

	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	private Date joinDate;
	
	//method to get unique ID
	public static int UniqueEmpID(){
		EmpCount = EmpCount + 1;
		return EmpCount;
	}
	
	public int GetID(){
		return EmpID;
	}
		
	public void setFirstName(String FirstName){
		this.firstName = FirstName;
	}

	public static int getEmpCount() {
		return EmpCount;
	}

	public int getEmpID() {
		return EmpID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}

	public String getGrade() {
		return grade;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setLastName(String LastName){
		this.lastName = LastName;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setGrade(String Grade){
		this.grade = Grade;
	}
	
//	public void setJoinDate(String jd){
//		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		try {
//			Date date1=df.parse(jd);
//
//			
//			
//			this.joinDate = date1;
//		} catch (ParseException e) {
//			
//			System.out.println("Date Exception hit" + e.getMessage());
//		}
//		
//		
//	}

	public void setJoinDate(int dd, int mm, int yyyy){
		
		
	}
	

}
