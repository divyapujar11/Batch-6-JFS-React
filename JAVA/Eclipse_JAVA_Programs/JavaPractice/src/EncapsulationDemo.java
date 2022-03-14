class Student  //Getters and Setters  ,Encapsulation
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("Divya");
		s1.setRollno(21);
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());

	}

}
