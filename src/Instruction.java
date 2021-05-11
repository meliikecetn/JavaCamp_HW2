
public class Instruction extends User{
	
	String givenCourse;
	
	public Instruction() {
		
	}

	public Instruction(int id, String firstName, String lastName, String email, String givenCourse) {
		super(id, firstName, lastName, email);
		this.givenCourse = givenCourse;
	}

	public String getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
	
	
}
