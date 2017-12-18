import java.util.ArrayList;

/*
By Aidan Sciortino and Linden Burack
2017
This class handles holding student data
*/
public class Student {
	private String name; //makes a "name" variable that can't be accesed from outside this class.
	private int id;//makes an "id" variable that can't be accesed from outside this class.
	private ArrayList<Absence> absences= new ArrayList<Absence>();
	
	public Student(String name,int id) {//makes a constructor method that sets the data.
		this.name=name;//set class variables equal to the class variables
		this.id=id;
	
	}
	public void addAbsence (Absence newAbsence) {
		absences.add(newAbsence);
	}
	public int getId () {
		return id;
	}
	public int getTotalAbsences() {
		return absences.size();
	}
	public String getName () {
		return name;
	}
	
}
