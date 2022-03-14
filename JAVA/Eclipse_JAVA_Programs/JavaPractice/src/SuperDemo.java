class A   // super class
{
	public A()
	{
		System.out.println("in A");
	}
	
	public A(int i)
	{
		System.out.println("in A int");
	}
}

class B extends A  //sub class
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	
	public B(int i)
	{
		super(i);  //This calls parameterized constructor of super class
		System.out.println("in B int");
	}
}


public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A obj1 = new A();
		B obj1 = new B(5);
	}

}
