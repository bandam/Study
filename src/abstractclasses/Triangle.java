package abstractclasses;

import java.util.Scanner;

public class Triangle extends GeometricObject {
	private int sideA;
	private int sideB;
	private int sideC;

	// Default constructor for triangle
	public Triangle() {
		super("white", false);
		sideA = 0;
		sideB = 0;
		sideC = 0;
	}

	public Triangle(int sideA, int sideB, int sideC, String color, boolean filled) {
		super(color,filled);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	/** Return sideA */
	public int getSideA() {
		return sideA;
	}

	/** Return sideB */
	public int getSideB() {
		return sideB;
	}

	/** Return sideC */
	public int getSideC() {
		return sideC;
	}

	/**
	 * @param sideA
	 *            the sideA to set
	 */
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	/**
	 * @param sideB
	 *            the sideB to set
	 */
	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	/**
	 * @param sideC
	 *            the sideC to set
	 */
	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	/**
	 * Return Area of triangle
	 */
	@Override
	public double getArea() {
	    double s = (sideA + sideB + sideC) / 2;
	    return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}

	/** Return perimeter of triangle */
	@Override
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	
	public String toString(){
		return "The triangle has sides: \nSideA: " + sideA + "\nSideB: "+ sideB + "\nSideC:  "+ sideC
		+ "\ncolor: " +getColor() + "\nFilled: " + isFilled();
	}
	
}
