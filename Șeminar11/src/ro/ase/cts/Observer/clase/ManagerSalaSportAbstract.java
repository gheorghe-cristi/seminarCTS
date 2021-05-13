package ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaSportAbstract {
	private List<Observator> observatori;

	public ManagerSalaSportAbstract() {
		super();
		this.observatori = new ArrayList<>();
	}
	
	public void adaugaObservator(Observator observator) {
		observatori.add(observator);
	}
	
	public void stergeObservator(Observator observator) {
		observatori.remove(observator);
	}
	
	public void notificaObservatori(String mesaj) {
		for(Observator o: observatori) {
			o.receptioneazaMesaj(mesaj);
		}
	}
}
