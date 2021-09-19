
public class Register {
	private String grade = "None";
	private int score;
	public Student fromStudent;
	public Course toCourse;
	
	public Register(Student student, Course course) {
		this.fromStudent = student;
		this.toCourse = course;
		
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setGrade(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	
}
