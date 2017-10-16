import java.util.Scanner;

public class StudentManagerConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeStudent();
	}
	public static void makeStudent() {
		Scanner scan = new Scanner(System.in); //Initialize a new scanner using the Standard Input
		
		System.out.print("Enter a Student name: "); //Print out a question prompt
		String newStudentName = scan.nextLine(); 
		System.out.print("Enter their Id: "); //Print out a question prompt
		int newStudentId = scan.nextInt();
		
		
		StudentManager.createStudent(newStudentName, newStudentId);
	}
}
