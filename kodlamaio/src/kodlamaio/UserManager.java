package kodlamaio;

public class UserManager {
	public void list(Student students) {
		System.out.println(students.firstName +" " + students.lastName  + " Listelendi");
	}
	public void add(Instructor instructor) {
		System.out.println( instructor.courseName + " Eklendi");
	}

}
