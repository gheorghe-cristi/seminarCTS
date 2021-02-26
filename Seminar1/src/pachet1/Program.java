package pachet1;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Program {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
	Girafa g1 = new Girafa("g1");
	Girafa g2 = new Girafa("g2");
	
	zoo.AdaugaAnimal(g1);
	zoo.AdaugaAnimal(g2);
	
	Zebra z1 = new Zebra("z1");
	Zebra z2 = new Zebra("z2");
	zoo.AdaugaAnimal(z1);
	zoo.AdaugaAnimal(z2);
	
	zoo.FeedAllAnimals();
	
	}
}
