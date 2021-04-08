package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.VerificatorPersoane;

public class Program {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Alex", "1955553232575");
		if(VerificatorPersoane.esteEligibila(persoana)) {
			System.out.println("Putem sa-i oferim creditul");
		} else {
			System.out.println("Nu putem sa-i oferim creditul");
		}
		
	}

}
