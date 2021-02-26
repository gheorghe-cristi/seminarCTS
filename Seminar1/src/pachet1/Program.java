package pachet1;

import clase.Girafa;
import clase.Zoo;

public class Program {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
	Girafa g1 = new Girafa("g1");
	Girafa g2 = new Girafa("g2");
	
	zoo.AdaugaAnimal(g1);
	zoo.AdaugaAnimal(g2);
	
	zoo.FeedAnimals();
	
	}
}
