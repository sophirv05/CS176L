package cs176l;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee sophia = new Employee("Sophia", 5);
		sophia.setName("Sophia Ramirez Velandia");	
		sophia.setSalary(50000);
		sophia.raiseSalary(10);
		System.out.println(sophia.getSalary());
	}


}
