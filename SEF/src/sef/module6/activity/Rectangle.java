package sef.module6.activity;


public class Rectangle extends Shape{
	private double length, breadth;
		
	public Rectangle (){ 
	
	}
	public Rectangle (double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	 public double calculateArea() {
	        double square = (length * breadth);
	        return square;
	    }
	 
	  	    public double calculatePerimeter (){
	        double perimeter = (length + breadth)*2;
	        return perimeter;
	    }
    
  public double getLength () {
	  return length;
  }
  public void setLength (double length) {
	  this.length=length;
  }
  public double getBreadth() {
	  return breadth;
  }
  public void setBreadth (double breadth) {
this.breadth=breadth;
}
 
}