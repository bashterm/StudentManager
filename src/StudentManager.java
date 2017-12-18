import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	static ArrayList<Student> Roster= new ArrayList<Student>();
	
	
	public static void createStudent(String newStudentName,int newStudentId) {	
		
		Student NewStudent=new Student(newStudentName,newStudentId);
	
		Roster.add(NewStudent);
	}
	public static Student findStudent(int id) {//creates a method that takes in the integer input: id
		for(int i=0;i<Roster.size();i++) {//defines i as 0, says to run the loop while i is less than the number of data points in the roster list, and tells the program that i will count up from its current value.
			Student Stu=Roster.get(i);//defines a variable with the student structure that equals the data in the roster at data point i
			if(id==Stu.getId()) {//if the found id equals the input then:
				return Stu;//return the value of i (the number of spaces into the array)
			}
		}
		return null;//if don't find anything return 100000
	}
	public static void addAbsence(int id) {
		Absence out=new Absence(false);
		findStudent(id).addAbsence(out);
	
		
	}
	public static int getAbsencesById(int id) {
		return findStudent(id).getTotalAbsences();
	}
	
}
