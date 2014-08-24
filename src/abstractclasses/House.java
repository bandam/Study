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
		return 0;
	}
	
	
	@Override
	/** Overriding the clone method defined in Object class and strengthing its accessibility */
}
