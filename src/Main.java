
public class Main {

	public static void main(String[] args) {
		
		Instruction instruction1 = new Instruction();
		instruction1.id=1;
		instruction1.firstName="Engin";
		instruction1.lastName="Demiroğ";
		instruction1.email="engindemirog@hotmail.com";
		instruction1.givenCourse="Java+React";
		
		Student student1 = new Student();
		student1.id=2;
		student1.firstName="Melike";
		student1.lastName="Çetin";
		student1.email="mlkctn@hotmail.com";
		student1.takenCourse="Java+React";
		
		UserManager userManager = new UserManager();
		userManager.addUser(student1);
		userManager.addUser(instruction1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.takeCourse(student1);
		
		InstructionManager instructionManager= new InstructionManager();
		instructionManager.giveCourse(instruction1);
		
		User user1 = new User(3,"yasin","bilgiç","yasnblgc@gmail.com");
		User user2 = new User(4,"melih","çetin","melihc@gmail.com");
		User user3 = new User(5,"rana","özdemir","rnozdemir@gmail.com");
		
		User[] users= {user1,user2,user3};
		userManager.multipleAddUser(users);
		
		
		
		
		
	}
}