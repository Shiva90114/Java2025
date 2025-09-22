// Shape Rectangle

import java.util.*;

class Shape{

	String color;
	Shape(String color){
	
		this.color = color;
	}
}
class Rectangle extends Shape{

	double length;
	double breadth;

	Rectangle(String color,double length,double breadth){
	
		super(color);
		this.length = length;
		this.breadth = breadth;

	}
	double calArea(){
	
		return length*breadth;
	}
	void Rectangle(){
	        System.out.println("Rectangle Details : ");
		System.out.println("Color : "+color);
		System.out.println("Length : "+length);
		System.out.println("Breadth : "+breadth);
		System.out.println("Area : "+calArea());
	}


}

class ShapeDetails{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Rectangle Color");
	String color = sc.nextLine();
	System.out.println("Enter Length :");
	double length = sc.nextDouble();
	System.out.println("Enter Breadth :");
	double breadth = sc.nextDouble();
	Rectangle rect = new Rectangle(color,length,breadth);
	rect.Rectangle();
	}
}
