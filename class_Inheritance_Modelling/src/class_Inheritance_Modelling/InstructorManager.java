package class_Inheritance_Modelling;

public class InstructorManager {
	public void add() {
		System.out.println("Instructor added.");
	}

	public void userInfo(Instructor instructor) {
		System.out.println("______________________________________________________");
		System.out.print("User Type: ");
		instructor.userType(instructor);
		System.out.println("ID: " + instructor.getId());
		System.out.println("Name: " + instructor.getName());
		System.out.println("Lastname: " + instructor.getLastName());
		System.out.println("Age: " + instructor.getAge());
		System.out.println("Gender: " + instructor.getGender());
		System.out.println("Instructor Lesson: " + instructor.getInstructorLesson());
		System.out.println("Instructor Number: " + instructor.getInstructorNumber());
		System.out.println("______________________________________________________");

	}

	public void adds(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			userInfo(instructor);

		}
	}
}
