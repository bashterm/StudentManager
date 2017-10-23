/*
By Aidan Sciortino and Linden Burack
2017
This class handles holding student data
*/
public class Student {
	private String name; //makes a "name" variable that can't be accesed from outside this class.
	private int id;//makes an "id" variable that can't be accesed from outside this class.
	private int tardies = 0;
	public Student(String name,int id) {//makes a constructor method that sets the data.
		this.name=name;//set class variables equal to the class variables
		this.id=id;
	}
	public void addTardy() {
		tardies += 1;
	}
}
