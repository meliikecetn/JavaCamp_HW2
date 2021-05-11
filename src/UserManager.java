
public class UserManager {
	
	public void addUser(User user) {
		
		System.out.println(user.firstName+" "+user.lastName+" isimli kullanýcý eklendi..");
	}
	
	public void multipleAddUser(User[] users) {
		
		for(User user: users) {
			
			addUser(user);
		}
	}
	
	
	
}
