import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	static ArrayList<Student> Roster= new ArrayList<Student>();
	
	
	public static void createStudent(String newStudentName,int newStudentId) {	
		
		Student NewStudent=new Student(newStudentName,newStudentId);
	
		Roster.add(NewStudent);
	}
	
}
