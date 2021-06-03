package ro.ase.cts.UnitTesting.teste.mocks;

import java.util.List;

import ro.ase.cts.UnitTesting.clase.IStudent;

public class DummyStudent implements IStudent{

	@Override
	public String getNume() {
		return null;
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
		return 0;
	}

	@Override
	public int getNota(int index) {
		return 0;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
