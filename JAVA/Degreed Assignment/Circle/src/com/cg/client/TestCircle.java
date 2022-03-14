package com.cg.client;
import com.cg.model.*;
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(2.0,"blue");
		System.out.println("The radius is: "+c1.getRadius()+" The color is: "+c1.getColor()+" The area is: "+c1.getArea());
		Circle c2 = new Circle(2.0,"red");
		System.out.println("The radius is: "+c2.getRadius()+" The color is: "+c2.getColor()+" The area is: "+c2.getArea());
		Circle c3 = new Circle(1.0,"red");
		System.out.println("The radius is: "+c3.getRadius()+" The color is: "+c3.getColor()+" The area is: "+c3.getArea());
	}

}
