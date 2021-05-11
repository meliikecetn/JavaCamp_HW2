
public class StudentManager extends UserManager {
	
	public void takeCourse(Student student) {
		
		System.out.println(student.firstName+" "+student.lastName+" isimli öğrenci "+
		student.takenCourse+" adlı kursa kaydoldu.");
	}
	
}
