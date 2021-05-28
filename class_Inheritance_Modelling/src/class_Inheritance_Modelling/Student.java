package class_Inheritance_Modelling;

public class Student extends User {

	private String studentNumber;
	private String classNo;
	private String classLetter;
	private String teacher;

	public Student() {

	}

	public Student(String studentNumber, String classNo, String classLetter) {

		this.studentNumber = studentNumber;
		this.classNo = classNo;
		this.classLetter = classLetter;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getClassLetter() {
		return classLetter;
	}

	public void setClassLetter(String classLetter) {
		this.classLetter = classLetter;
	}

	public String getTeacher() {

		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public void userType(User user) {
		System.out.println("This is Student.Not instructor.");
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
}
