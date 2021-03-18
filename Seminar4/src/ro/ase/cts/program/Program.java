package ro.ase.cts.program;

import ro.ase.cts.clase.Garsoniera;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {
	
	public static void main(String[] args) {
		Presedinte presedinte1 = Presedinte.getInstance();
		Presedinte presedinte2 = Presedinte.getInstance();
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
			presedinte1.setNume("Basescu");
			presedinte2.setMandat(3);
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("presedinteLazy", 40, 4);
		PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("presedinteLazy22", 50, 1);
		
		System.out.println(presedinteLazy1.toString());
		System.out.println(presedinteLazy2.toString());
		
		
		Garsoniera garsoniera1 = Garsoniera.getInstance("Aleea Florilor", 20, 1940);
		Garsoniera garsoniera2 = Garsoniera.getInstance("Aleea Lalelelor", 55, 1977);
		
		System.out.println(garsoniera1.toString());
		System.out.println(garsoniera2.toString());
				
	}

}