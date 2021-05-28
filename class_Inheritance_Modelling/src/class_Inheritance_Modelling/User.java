package class_Inheritance_Modelling;

public class User {

	private int id;
	private String gender;
	private String age;
	private String name;
	private String lastName;

	public User() {
		super();
	}

	public User(int id, String gender, String age) {
		super();
		this.id = id;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void userType(User user) {
		System.out.println("This is User. Not student or not instructor");
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
}
