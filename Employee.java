package cs176l;

public class Employee {
	private String name;
	private double salary;	
	
	public Employee (String employeeName,double employeeSalary) {
		name = employeeName;
		salary = employeeSalary;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSalary(double newSalary) {	
		salary = newSalary;	
	}

	public double getSalary() {
		return salary;
	} 
	
	public double raiseSalary (double byPercent) {
		return salary += salary * (0.01 * byPercent);
	}
	
	
}
