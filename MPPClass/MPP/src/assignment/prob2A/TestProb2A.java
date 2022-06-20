package assignment.prob2A;

public class TestProb2A {

	public static void main(String[] args) {
		Student student = new Student("Puskar Budhathoki");
		
		GradeReport gradeReport = student.getGradeReport();
		
		System.out.println(student);

	}

}
