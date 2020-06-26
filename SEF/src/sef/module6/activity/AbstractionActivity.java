package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		s.setColor ("blue");
		
		Rectangle r = new Rectangle();
		r.setLength (5);
		r.setBreadth(6);
		r.calculateArea();
		r.calculatePerimeter();
			
		
	    System.out.println("Length of rectangle is: " +r.getLength());
		System.out.println("Breadth of rectangle is: " +r.getBreadth());	
		System.out.println("Color of rectangle is: " + s.getColor());
		System.out.println("Area of rectangle is: " + r.calculateArea());
		System.out.println("Perimeter of rectangle is: " + r.calculatePerimeter());
		
	
	
}
		
}