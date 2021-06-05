package class_Inheritance_Modelling;

public class UserManager {
	public void add() {
		System.out.println("User added.");
	}
	public void userInfo(User user) {
		System.out.println("______________________________________________________");
		System.out.print("User Type: ");
		user.userType(user);
		System.out.println("ID: " + user.getId());
		System.out.println("Name: " + user.getName());
		System.out.println("Lastname: " + user.getLastName());
		System.out.println("Age: " + user.getAge());
		System.out.println("Gender: " + user.getGender());
		System.out.println("______________________________________________________");
	}
	public void adds(User[] users) {
		for(User user:users) {
			userInfo(user);
			
		}
	}
}