import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); //Initialize a new scanner using the Standard Input
		
		System.out.print("Enter a Student name: "); //Print out a question prompt
		String Student1 = scan.nextLine(); 
		System.out.print("Enter their Id: "); //Print out a question prompt
		int Student1Id = scan.nextInt();
				
		Student Stu=new Student(Student1,Student1Id); //making an istance of a class called "Stu" 
	}
}
