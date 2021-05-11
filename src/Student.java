
public class Student extends User {
	
	String takenCourse;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email, String takenCourse) {
		super(id, firstName, lastName, email);
		this.takenCourse = takenCourse;
	}

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}
	
}
