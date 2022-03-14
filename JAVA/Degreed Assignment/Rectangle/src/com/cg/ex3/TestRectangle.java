package com.cg.ex3;
import com.cg.ex3.*;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1.2f,3.4f);
		System.out.println(r1);
		Rectangle r2 = new Rectangle();
		System.out.println(r2);
		
		//Tests for getters and setters
		System.out.println(r1);
		System.out.println("length is: "+r1.getLength());
		System.out.println("width is: "+r2.getWidth());
		
		//test getArea() and getPerimeter()
		System.out.printf("area is : %.2f%n",r1.getArea());
		System.out.printf("perimeter is: %.2f%n", +r1.getWidth());
	}

}
