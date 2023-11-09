package cs176l;

import java.util.ArrayList;

// Sophia Ramirez Velandia, Thomas Farrell, and Olivia Franczykowski

class Student {
    String name;
    String id;
    ArrayList<Grade> grades;

    // Constructor for the student class
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }
    
    // Accessor method for name
    public String getName() {
    	return name;
    }
    
    // Accessor method for student ID
    public String getId() {
        return id;
    }

    // Method to add a grade for a test
    public void addGrade(int testNumber, int score) {
        grades.add(new Grade(testNumber, score));
    }

    // Accessor method to get a grade for a specific test
    public int getGrade(int testNumber) {
        for (Grade grade : grades) {
            if (grade.testNumber == testNumber) {
                return grade.score;
            }
        }
        return -1; // Grade not found
    }
}

class Grade {
    int testNumber;
    int score;

    // Constructor for the grade class
    public Grade(int testNumber, int score) {
        this.testNumber = testNumber;
        this.score = score;
    }
}

class Course {
    String courseName;
    String major;
    String level;
    ArrayList<Student> students;

    // Constructor for the Course class
    public Course(String courseName, String major, String level) {
        this.courseName = courseName;
        this.major = major;
        this.level = level;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(String name, String id) {
        students.add(new Student(name, id));
    }

    // Method to add a grade for a specific student
    public void addGrade(String studentId, int testNumber, int score) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.addGrade(testNumber, score);
                return;
            }
        }
        System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
        System.out.println("");
    }

    // Method to print grades for a specific test
    public void printGrade(int testNumber) {
        for (Student student : students) {
            int score = student.getGrade(testNumber);
            if (score != -1) {
                System.out.println(student.name + " " + score);
            }
        }
        System.out.println("");
    }

    // Method to sort students by grade for a specific test
    public void sortGrade(int testNumber) {
        boolean testSort;
        do {
        	testSort = false;
            for (int i = 0; i < students.size() - 1; i++) {
                int score1 = students.get(i).getGrade(testNumber);
                int score2 = students.get(i + 1).getGrade(testNumber);
                if (score1 < score2) {
                    // Swap students without using Collections
                    Student temp = students.get(i);
                    students.set(i, students.get(i + 1));
                    students.set(i + 1, temp);
                    testSort = true;
                }
            }
        } while (testSort);
    }

    // Method to update a student's grade for a specific test
    public void updateGrade(String studentId, int newScore) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.grades.set(0, new Grade(1, newScore)); // Update the score for test 1
                return;
            }
        }
        System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
    }

}
