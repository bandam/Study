

package abstractclasses;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** Construct a default geometric object */
	protected GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	
	/** Construct a geometric object with color and filled value*/
	protected GeometricObject(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** Return color */
	public String getColor(){
		return color;
	}

	/** Return filled*/
	public boolean isFilled() {
		return filled;
	}

	
	/** Set filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	
	/** Get date Created */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Set date created */
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/** Set color */
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString(){
		return  "created on " + this.dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	
	/** Abstract method getArea */
	public abstract double getArea();
	
	
	/** Abstract method getPerimete */
	public abstract double getPerimeter();
}
