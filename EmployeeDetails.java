package week1.Day2.Assignments;

public class EmployeeDetails {
	public void EmployeeName (String empName, int empId)
	{
		System.out.println("Employee Name and id - "+empName+empId);
	}
	public void getEmployeeAddress(String empAddress)
	{
		System.out.println("Address - "+empAddress);
	}
	public void EmployeeSalary(double empSalary)
	{
		System.out.println("Salary -"+empSalary);
	}
public static void main(String[] args) {
	EmployeeDetails emp = new EmployeeDetails();
	emp.EmployeeName("Ramya", 28);
	emp.getEmployeeAddress("Salem");
	emp.EmployeeSalary(20000.00);
}
}
