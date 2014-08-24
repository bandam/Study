package abstractclasses;

public class GeometricObject_Test {
	public static void main(String[] args){
		GeometricObject geoObj = new Circle("yellow",true, 25);
		//geoObj.setColor("brown");
		
		System.out.println(geoObj.getArea());
		System.out.println(geoObj.getPerimeter());
		System.out.println(geoObj.getColor());
	}
}
