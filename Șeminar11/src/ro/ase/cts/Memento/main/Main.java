package ro.ase.cts.Memento.main;

import ro.ase.cts.Memento.clase.ManagerMeciuri;
import ro.ase.cts.Memento.clase.Meci;

public class Main {

	public static void main(String[] args) {
		Meci meci = new Meci("echipaGazda", "echipaOaspeti" , 200, 200, 10, 5);
		ManagerMeciuri manager = new ManagerMeciuri();
		
		manager.adaugaMemento(meci.creareMemento());
		meci.setNrSpectatori(180);
		manager.adaugaMemento(meci.creareMemento());
		
		System.out.println(meci.toString());
		meci.seteazaMemento(manager.cereMemento(0));
		System.out.println(meci.toString());
		meci.seteazaMemento(manager.getLastMemento());
		System.out.println(meci.toString());
	}

}
