package class_Inheritance_Modelling;

public class Main {

	public static void main(String[] args) {

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add();
		StudentManager studentManager = new StudentManager();
		studentManager.add();
		UserManager userManager = new UserManager();
		userManager.add();
		User user = new User();
		user.userType(user);
		Student student = new Student();
		Instructor instructor = new Instructor();

		instructor.userType(user);
		instructor.setName("Kemal");
		instructor.setLastName("EKMEN");
		instructor.setAge("29");
		instructor.setGender("Male");
		instructor.setId(2);
		instructor.setInstructorLesson("Maths");
		instructor.setInstructorNumber("2123");
		System.out.println("______________________________________________________\n");
		
		student.userType(user);
		student.setName("Deniz");
		student.setLastName("Ç.");
		student.setTeacher(instructor.getName() + " " + instructor.getLastName());
		student.setAge("15");
		student.setClassNo("7");
		student.setClassLetter("A");
		student.setGender("Male");
		student.setId(1);
		student.setStudentNumber("757");
		System.out.println("______________________________________________________\n");
		studentManager.add();
		student.userInfo(student);

		instructorManager.add();
		instructor.userInfo(instructor);

	}

}
