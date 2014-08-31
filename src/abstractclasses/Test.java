package abstractclasses;

public class Test {
	public static void main(String[] args)throws CloneNotSupportedException{
		
		House house1 = new House(2, 23);
		House house2 = (House)house1.clone();
		
		
		System.out.println(house1.compareTo(house2));
	}
	
}
