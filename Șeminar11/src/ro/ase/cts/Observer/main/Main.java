package ro.ase.cts.Observer.main;

import ro.ase.cts.Observer.clase.Client;
import ro.ase.cts.Observer.clase.ManagerSalaSport;

public class Main {

	public static void main(String[] args) {
		ManagerSalaSport manager = new ManagerSalaSport();
		Client client1 = new Client("George");
		Client client2 = new Client("Gabriel");
		Client client3 = new Client("Ionut");
		
		manager.adaugaObservator(client1);
		manager.adaugaObservator(client2);
		manager.adaugaObservator(client3);
		
		manager.anuntaMeci("Fotbal");
		
		manager.stergeObservator(client3);
		manager.anuntaMeci("Handbal");
	}

}
