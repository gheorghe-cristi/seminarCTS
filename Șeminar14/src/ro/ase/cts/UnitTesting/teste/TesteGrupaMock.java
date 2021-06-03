package ro.ase.cts.UnitTesting.teste;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ro.ase.cts.UnitTesting.clase.Grupa;
import ro.ase.cts.UnitTesting.clase.IStudent;
import ro.ase.cts.UnitTesting.teste.mocks.DummyStudent;
import ro.ase.cts.UnitTesting.teste.mocks.FakeStudent;
import ro.ase.cts.UnitTesting.teste.mocks.StubStudent;

public class TesteGrupaMock {

	@Test
	public void testAdaugaStudent() {
		IStudent student = new DummyStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		assertEquals("Adaugare student", 1, grupa.getStudenti().size()); 
	}

	@Test
	public void testGetPromovabilitate() {
		IStudent student = new StubStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
	
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<8; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<2; i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(), 0.001);
	}
}
