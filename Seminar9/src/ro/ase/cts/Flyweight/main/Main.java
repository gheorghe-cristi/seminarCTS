package ro.ase.cts.Flyweight.main;

import ro.ase.cts.Flyweight.clase.Client;
import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1, 3, 14);
		Rezervare rezervare2 = new Rezervare(2, 4, 15);
		Rezervare rezervare3 = new Rezervare(3, 5, 16);
		Rezervare rezervare4 = new Rezervare(4, 6, 17);
		
		FlyweightFactory factory = new FlyweightFactory();
		Client client1 = (Client) factory.getFlyweight("07703");
		client1.printeazaRezervare(rezervare1);
		
		factory.getFlyweight("07703").printeazaRezervare(rezervare2);
		factory.getFlyweight("07704").printeazaRezervare(rezervare3);
		factory.getFlyweight("07704").printeazaRezervare(rezervare4);
	}

}
