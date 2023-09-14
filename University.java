package cs176l;

public class University {
	public String universityName;
	private int numberStudents;
	
	public University (String name, int students) {
		universityName = name;
		numberStudents = students;
	}
	
	
	public String getName() {
		return universityName;
	}

	
	public int totalOfStudents() {
		return numberStudents;
	}	
	
	public static void main(String[] args) {
		University monmouth = new University("Monmouth University", 6371);
		
		System.out.println(monmouth.getName());
		System.out.println("Total of students: " + monmouth.totalOfStudents());
	
	}
}
