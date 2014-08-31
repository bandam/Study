package abstractclasses;

import java.util.Comparator;


/** Comparator that compares two circles based on radius attribute
 * Returns:
 * c1>c1: 1
 * c1<c2: -1
 * c1==c2: 0
 */
public class CirlcleRadiusComparator implements Comparator<Circle>{
	public int compare(Circle c1, Circle c2){
		return (c1.getRadius() > c2.getRadius())? 1 : (c1.getRadius() < c2.getRadius())? -1:0;
	}
}
