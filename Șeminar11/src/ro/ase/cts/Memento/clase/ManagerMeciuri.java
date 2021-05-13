package ro.ase.cts.Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuri {
	private List<Memento> mementoList;

	public ManagerMeciuri() {
		super();
		this.mementoList = new ArrayList<>();
	}
	
	public void adaugaMemento(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento cereMemento(int index) {
		if(index>=0 && index <mementoList.size()) {
			return mementoList.get(index);
		}
		return null;
	}
	
	public Memento getLastMemento() {
		return mementoList.get(mementoList.size()-1);
	}
}
