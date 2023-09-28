package cs176l;

public class StudentGrade {
	final int MINIMUMGRADE = 0; //constant - cannot be changed
	final int MAXIMUNGRADE = 100;
	final int DEFAULT_GRADE = 60;
	final int AGRADE = 90;
	final int BGRADE = 80;
	final int CGRADE = 70;
	private int grade;
	private String name;
	
	public StudentGrade(String name) {
		this.name = name;
		this.grade = DEFAULT_GRADE;
	}
	
	public StudentGrade(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void setGrade(int grade) { //check if it is a valid number
		this.grade = grade;
		if(grade > MINIMUMGRADE && grade < MAXIMUNGRADE) {
			this.grade = grade;
			return;
		} else {
			this.grade = DEFAULT_GRADE;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String retGradeLevel() {
		if(grade > AGRADE) {
			return "A";
		} else if(grade >= BGRADE && grade < AGRADE) {
			return "B";
		}
		else if(grade >= CGRADE && grade < BGRADE) {
			return "C";
		} else {
			return "D";
		}
	}
	
	public static void main(String[] args) {
		StudentGrade sophia = new StudentGrade("Sophia");
		StudentGrade thomas = new StudentGrade("Thomas", 99);
		System.out.println(sophia.getGrade()); 
		System.out.println(thomas.getGrade()); 
		// test setGrade
		sophia.setGrade(-100);
		System.out.println(sophia.getGrade()); 
		sophia.setGrade(1000);
		System.out.println(sophia.getGrade());
		sophia.setGrade(88);
		System.out.println(sophia.getGrade()); 
		//test retGradeLevel
		System.out.println(thomas.retGradeLevel()); 
		System.out.println(sophia.retGradeLevel()); 
		sophia.setGrade(77);
		System.out.println(sophia.retGradeLevel());
		sophia.setGrade(54);
		System.out.println(sophia.retGradeLevel());
		
	}

	
	
}
