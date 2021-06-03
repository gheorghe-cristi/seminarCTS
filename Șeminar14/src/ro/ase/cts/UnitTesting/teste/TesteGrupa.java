package ro.ase.cts.UnitTesting.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.UnitTesting.clase.Grupa;
import ro.ase.cts.UnitTesting.clase.Student;
import ro.ase.cts.UnitTesting.teste.categorii.ConstructorGrupaCategory;
import ro.ase.cts.UnitTesting.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.UnitTesting.teste.categorii.TesteUrgenteCategory;

public class TesteGrupa {

	
	@Test
	@Category({ConstructorGrupaCategory.class, TesteUrgenteCategory.class})
	public void testConstructorGrupa() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081, grupa.getNrGrupa());
	}

	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorExistenceLista() {
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testLimitaInferioaraGrupa() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testLimitaSuperioaraGrupa() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testExceptieInferiorConstructor() {
		new Grupa(100);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testExceptieSuperiorConstructor() {
		new Grupa(2000);
	}
	
	@Test(timeout = 500)
	@Category(ConstructorGrupaCategory.class)
	public void testPerformantaConstructor() {
		new Grupa(1000);
	}
	
	@Test
	@Category({GetPromovabilitateCategory.class, TesteUrgenteCategory.class})
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<10; i++) {
			Student s = new Student("Student"+i);
			s.adaugaNota(10);
			s.adaugaNota(7);
			grupa.adaugaStudent(s);
		}
		for(int i=0; i<5; i++) {
			Student s = new Student("Stud"+i);
			s.adaugaNota(4);
			s.adaugaNota(7);
			grupa.adaugaStudent(s);
		}
		
		assertEquals(0.66, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateSupBoundary() {
		Grupa grupa = new Grupa(1001);
		for(int i=0; i<5; i++) {
			Student s = new Student("Stud"+i);
			s.adaugaNota(4);
			s.adaugaNota(7);
			grupa.adaugaStudent(s);
		}
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateInfBoundary() {
		Grupa grupa = new Grupa(1001);
		for(int i=0; i<5; i++) {
			Student s = new Student("Stud"+i);
			s.adaugaNota(9);
			s.adaugaNota(7);
			grupa.adaugaStudent(s);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1001);
		grupa.getPromovabilitate();
	}
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateCardinality1() {
		Grupa grupa = new Grupa(1001);
		Student s = new Student("Stud");
		s.adaugaNota(9);
		s.adaugaNota(7);
		grupa.adaugaStudent(s);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
}
