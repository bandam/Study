package abstractclasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
	
	public static void main(String[] args){
		ArrayList<Number> list = new ArrayList<Number>();
		
		list.add(45);
		list.add(3445.45);
		
		list.add(new BigInteger("555555555555555555555555555544444"));
		list.add(new BigDecimal("2.666666666666666654875457814"));
		
		System.out.println("The biggest number is:  " + getLargestNumber(list));
	}
	
	public static Number getLargestNumber(ArrayList<Number> list){
		if(list == null || list.size() == 0)
			return null;
		
		
		Number number = list.get(0);
		for(int i = 1; i < list.size(); i++){
			if(number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		}
		
		return number;
	}
}
