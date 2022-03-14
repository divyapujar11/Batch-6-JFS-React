// VarArgs 
class Calc{
	public int add(int ... n) // acts like array
	{
		int sum=0;
		for(int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s1=new Student();
		
		//Student s[]= {s1,s2,s3,s4};
		//int suds[]= {3,5,22,87,5,0};
	/* 1D Array Examples	
		int nums[] = new int[4];
		nums[0]=8;
		nums[1]=2;
		nums[2]=45;
		nums[3]=67;
		
		nums[2]=99;
		System.out.println(nums[2]);
		for(int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}*/
	/* 2d array and Jagged array:	
		int d[][]= {{1,2,3,4},{2,6,8},{1,3,5,7}};
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]);
			}
			System.out.println();
		}
	*/
	/* for each loop	
		int a[]= {1,2,3,4};
		// FOR EACH loop is used for array loop
		for(int k:a) {
			System.out.println(k);
		}
	*/
		//VarArgs 
		Calc obj=new Calc();
		System.out.println(obj.add(4,5,6,7,8,8,4));
	
	}

}
