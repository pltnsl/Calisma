package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Student students = new Student();
		students.id=1;
		students.firstName="Neslihan";
		students.lastName="PULAT";
		students.password="123321";
		students.courseProgramDate ="25.10.2020 - 15.03.2021";
		
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.password="789987";
		instructor.courseName="Yazılım Geliştirme Programı";
		
		StudentManager studentManager = new StudentManager();
        studentManager.list(students);
		
        InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
	}

}
