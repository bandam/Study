package abstractclasses;

import java.util.Scanner;

public class Excersice15_2 {
	public static void main(String[] args){
		int sideA;
		int sideB;
		int sideC;
		String color;
		boolean filled;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter sideA:  ");
		sideA = scanner.nextInt();
		
		System.out.println("Please enter sideB:  ");
		sideB = scanner.nextInt();
		
		System.out.println("Please enter sideC: ");
		sideC = scanner.nextInt();
		
		
		System.out.println("Please enter color: ");
		color = scanner.next();
		
		System.out.println("Please enter filled");
		filled = scanner.nextBoolean();
		
		
		Triangle triangle = new Triangle(sideA, sideB, sideC,color,filled);
		
		System.out.println("\n\nTriangle's area : " + triangle.getArea());
		System.out.println("\nTriangle perimeter: " + triangle.getPerimeter());
		
		System.out.println(triangle.toString());
		scanner.close();
		
		
	}
}
