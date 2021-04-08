package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Agentie;
import ro.ase.cts.composite.clase.Filiala;

public class Program {

	public static void main(String[] args) {
		Agentie agentie1 = new Agentie();
		Agentie agentie2 = new Agentie();
		Agentie agentie3 = new Agentie();
		
		Filiala filiala1 = new Filiala("Filiala1");
		Filiala filiala2 = new Filiala("Filiala2");
		Filiala filiala3 = new Filiala("Filiala3");
		Filiala filiala4 = new Filiala("Filiala4");
		
		agentie1.adaugaNod(filiala1);
		agentie1.adaugaNod(filiala2);
		agentie1.adaugaNod(agentie3);
		
		agentie2.adaugaNod(filiala3);
		
		agentie3.adaugaNod(filiala4);
		
		agentie1.afisareDescriere();
		System.out.println();
		agentie2.afisareDescriere();
		
		agentie3.stergeNod(filiala4);
		agentie1.adaugaNod(filiala4);
		
		agentie1.stergeNod(agentie3);
		
		System.out.println("Agentia 3 a fost eliminata.");
		
		agentie1.afisareDescriere();
		System.out.println();
		agentie2.afisareDescriere();
	}

}
