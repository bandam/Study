package abstractclasses;

public class Circle extends GeometricObject{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(String color, Boolean filled, double radius){
		super(color,filled);
		this.radius = radius;
	}
	
	/** Return radius */
	public double getRadius(){
		return radius;
	}
	
	/** Set radius */
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	@Override /** Return area */
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	@Override /** Return perimeter */
	public double getPerimeter(){
		return 2 * radius;
	}
	
	
	public void printCircle(){
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}
