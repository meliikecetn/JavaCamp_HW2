
public class StudentManager extends UserManager {
	
	public void takeCourse(Student student) {
		
		System.out.println(student.firstName+" "+student.lastName+" isimli ��renci "+
		student.takenCourse+" adl� kursa kaydoldu.");
	}
	
}
