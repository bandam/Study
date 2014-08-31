package abstractclasses;

import java.util.ArrayList;

public class Excersice15_4 {
	
	public static void main(String[] args){
		ArrayList<Number> list = new ArrayList<Number>();
		
		list.add(new Double("2222"));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(new Integer(2));
		
		System.out.println(list);
		sort(list);
		System.out.println(list);
	}
	public static void sort(ArrayList<Number> list){
		
		Number temp;
		for(int i = 0; i <list.size()-1; i++){
			int currentMin = i+1;
			for(int j = i+1; j < list.size(); j++){
				
				if(list.get(j).doubleValue() < list.get(currentMin).doubleValue())
					currentMin = j;
			}
			
			if(list.get(currentMin).doubleValue()< list.get(i).doubleValue()){
				temp = list.get(i);
				list.set(i, list.get(currentMin));
				list.set(currentMin, temp);
			}
		}
		
	}
}
