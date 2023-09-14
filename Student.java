package cs176l;

public class Student {
	public String studentName;
	public int score;
	public int total;
	public int average;
	private int numberQuizzes;
	
	public Student (String name) {
		studentName = name;
	}
	
	
	public String getName() {
		return studentName;
	}
	
	public void addScore(int score) {
		total += score;
		numberQuizzes++;
	}	
	
	public int getTotalScore() {
		return total;
	}	
	
	public int getAverageScore() {
		int average = total/numberQuizzes;
		return average;
	}
	
	public static void main(String[] args) {
		Student sophi = new Student("Sophi");
		sophi.addScore(82);
		sophi.addScore(93);
		sophi.addScore(75);
		sophi.addScore(67);
		sophi.addScore(98);
		
		System.out.println("Student name: " + sophi.getName());
		System.out.println("Total score: " + sophi.getTotalScore());
		System.out.println("Average score: " + sophi.getAverageScore());
		
	}
}
