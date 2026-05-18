package assignment3;

class MarksOutOfBoundException extends Exception{
	public MarksOutOfBoundException(){
		System.out.println("Marks is greater than 100!");
	}
}
class Student{
	String name;
	int mark;
	public Student (String name, int mark) throws MarksOutOfBoundException{
		if(mark>100)
			throw new MarksOutOfBoundException();
		this.name = name;
		this.mark = mark;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Marks: " + mark);
	}
}
public class Q3 {

	public static void main(String[] args) {
		try{
			Student s = new Student("ARC", 102);
			s.display();
		}
		catch(MarksOutOfBoundException e){
			System.out.println(e);
		}
	}

}
