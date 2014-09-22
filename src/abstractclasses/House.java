package abstractclasses;

public class House implements Cloneable, Comparable<House>{
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	
	public House(int id, double area){
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	
	
	public int getId(){
		return id;
	}
	
	public double getArea(){
		return area;
	}
	
	public java.util.Date whenBuilt(){
		return whenBuilt;
	}
	
	@Override
	public int compareTo(House h){
		if(area > h.area)
			return 1;
		
		else if(area < h.area)
			return -1;
		
		else
			return 0;
	}
	
	
	@Override
	/** Overriding the clone method defined in Object class and strengthing its accessibility */
	public Object clone() throws CloneNotSupportedException{
		House copyOfHouse = (House) super.clone();
		
		copyOfHouse.whenBuilt = (java.util.Date)whenBuilt.clone();
		
		
		return copyOfHouse;
	}
}
