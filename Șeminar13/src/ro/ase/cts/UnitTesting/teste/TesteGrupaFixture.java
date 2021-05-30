package ro.ase.cts.UnitTesting.teste;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.UnitTesting.clase.Grupa;
import ro.ase.cts.UnitTesting.clase.Student;

public class TesteGrupaFixture {
	private Grupa grupa;

	@Before
	public void setup() {
		grupa = new Grupa(1081);
		for(int i=0; i<20; i++) {
			Student s = new Student("Student"+i);
			s.adaugaNota(10);
			s.adaugaNota(7);
			grupa.adaugaStudent(s);
		}
		for(int i=0; i<15; i++) {
			Student s = new Student("Stud"+i);
			s.adaugaNota(4);
			s.adaugaNota(7);
			grupa.adaugaStudent(s);
		}
	}
	
	@Test(timeout = 500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}

}
