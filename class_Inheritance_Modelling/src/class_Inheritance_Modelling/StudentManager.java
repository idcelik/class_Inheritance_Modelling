package class_Inheritance_Modelling;

public class StudentManager {
	public void add() {
		System.out.println("Student added.");
	}
	

	public void userInfo(Student student) {
		System.out.println("______________________________________________________");
		System.out.print("User Type: ");
		student.userType(student);
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Lastname: " + student.getLastName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Gender: " + student.getGender());
		System.out.println("Class Letter: " + student.getClassLetter());
		System.out.println("Class Number: " + student.getClassNo());
		System.out.println("Student Number: " + student.getStudentNumber());
		System.out.println("Student's Teacher: " + student.getTeacher());
		System.out.println("______________________________________________________");

	}
	
	public void adds(Student[] students) {
		for (Student student : students) {
			userInfo(student);

		}
	}
}
