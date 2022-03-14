class Calculator     //super,parent,base class  //super0
{
	public int add(int i,int j) {
		return i+j;
	}
}

class CalcAdv extends Calculator //sub,child,derived class //super1
{
	public int sub (int i, int j) {
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv  // sub
{
	public int multi(int i,int j)
	{
		return i*j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcVeryAdv c1 = new CalcVeryAdv();
		int results1 = c1.add(5, 4);
		int results2 = c1.sub(6,3);
		int results3 = c1.multi(3,4);
		
		System.out.println(results1);
		System.out.println(results2);
		System.out.println(results3);
	}

}
