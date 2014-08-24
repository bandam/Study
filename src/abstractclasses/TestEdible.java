package abstractclasses;

public class TestEdible {
	public static void main(String[] args){
		Object[] objects = {new Tiger(), new Chicken(), new Apple()};
		
		for(int i = 0; i < objects.length; i++){
			
			if(objects[i] instanceof Edible)
				System.out.println(((Edible)objects[i]).howToEat());
			
			if(objects[i] instanceof Animal)
				System.out.println(((Animal)objects[i]).sound());
		}
	}
}

abstract class Animal{
	/** Return animal sound */
	public abstract String sound();
}

class Chicken extends Animal implements Edible{
	
	public String sound(){
		return "chicken: cock-a-doodle-doo";
	}
	
	public String howToEat(){
		return "Chicken: Fry it";
	}
}

class Tiger extends Animal{
	public String sound(){
		return "Tiger: RRROOOAARR";
	}
}

abstract class Fruit implements Edible{
}

class Apple extends Fruit{
	public String howToEat(){
		return "Apple: Make apple cider";
	}
}

class Orange extends Fruit{
	public String howToEat(){
		return "Orange: Make orange juice";
	}
}

