import java.util.Scanner;

public class StudentManagerConsole {
	static Scanner scan = new Scanner(System.in); //Initialize a new scanner using the Standard Input
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true){
			console();
		}
			
	}
	public static void console() {
		System.out.print(">");
		String command = scan.nextLine();
		if (command.equals("add")) {
			makeStudent();
		}
		if (command.equals("quit") || command.equals("exit")) {
			System.exit(0);
		}
		if (command.equals("help")) {
			help();
		}
	}
	
	public static void help() {
		System.out.println("Welcome To Student Manager");
		System.out.println("-add -- Creates a new student with inputs for attrubutes: Name, ID");
		System.out.println("-exit -- Quits the program");
		
	}
	
	
	
	public static void makeStudent() {
		
		
		System.out.print("Enter a Student name: "); //Print out a question prompt
		String newStudentName = scan.nextLine(); 
		System.out.print("Enter their Id: "); //Print out a question prompt
		int newStudentId = scan.nextInt();
		
		
		StudentManager.createStudent(newStudentName, newStudentId);
	}
}
