public class TestStudent{
public static void main(String[] args) {
	Student s1 = new Student("1440712345", "Piwat");
	Student s2 = new Student("1440767890", "Dara");
	Course c1 = new Course("CS455", "Computer Network");
	Course c2 = new Course("CS311", "Computer Programming II");
	Register r1 = new Register(s1, c1);
	Register r2 = new Register(s1, c2);
	Register r3 = new Register(s2, c1);
	r1.setGrade("A");
	r2.setGrade("B");
	r3.setGrade(85);
	System.out.println(r1.fromStudent.getName() + " has " + r1.getGrade() +" in " + r1.toCourse.getId() + " " + r1.toCourse.getName() );
	System.out.println(r2.fromStudent.getName() + " has " + r2.getGrade() +" in " + r2.toCourse.getId() + " " + r2.toCourse.getName() );
	System.out.println(r3.fromStudent.getName() + " has " + r3.getGrade() +" in " + r3.toCourse.getId() + " " + r3.toCourse.getName() );
}
}
 /*
Piwat has A in CS455 Computer Network
Piwat has B in CS311 Computer Programming II
Dara has None in CS455 Computer Network
*/