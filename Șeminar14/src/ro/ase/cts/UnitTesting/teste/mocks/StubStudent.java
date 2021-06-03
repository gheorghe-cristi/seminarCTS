package ro.ase.cts.UnitTesting.teste.mocks;

import java.util.List;

import ro.ase.cts.UnitTesting.clase.IStudent;

public class StubStudent implements IStudent{

	@Override
	public String getNume() {
		return "Gigel";
	}

	@Override
	public void setNume(String nume) {
	}

	@Override
	public List<Integer> getNote() {
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		
	}

	@Override
	public float calculeazaMedie() {
		return 7.7f;
	}

	@Override
	public int getNota(int index) {
		return 8;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
