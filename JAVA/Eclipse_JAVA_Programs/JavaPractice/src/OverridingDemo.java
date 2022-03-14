class A1  //super class
{
	// int i;
	public void show()
	{
		/*
		i=9;
		System.out.println(i); */
		System.out.println("class A1");
	}
}

class B1 extends A1 //sub class
{
	int i;
	public void show(){
		/*
		System.out.println(super.i=8); //can be done like this also
		i=7;
		super.show();  //calls show() method from class A1
		System.out.println(i);
		*/
		System.out.println("Class B1");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj1 = new B1();
		obj1.show();
	}

}
