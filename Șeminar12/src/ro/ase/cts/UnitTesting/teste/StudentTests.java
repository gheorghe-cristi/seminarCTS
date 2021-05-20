package ro.ase.cts.UnitTesting.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.UnitTesting.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "George";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
		assertNotNull(student.getNote());
	}

	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		
		assertNotNull(student.getNume());
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAdaugaNotaSingura() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(9);
		student.adaugaNota(9);
		
		assertEquals(3, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(10);
		student.adaugaNota(8);
		
		assertEquals(9f, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		student.adaugaNota(8);
		assertEquals(8, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(6);
		assertFalse(student.areRestante());
	}
	
	// JUnit 3
	@Test
	public void testGetNotaExceptie() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		
		try {
			student.getNota(5);
			fail("Nu trebuie sa ajunga aici. Metoda nu arunca exceptie.");
		} catch (IndexOutOfBoundsException e) {
			
		}
		catch (Exception e) {
			fail("Metoda arunca o alta exceptie.");
		}
	}
	
	// JUnit4
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaExceptieV4() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		
		student.getNota(5);
	}
	
	// JUnit5 
	/*@Test
	public void testGetNotaExceptieV5() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(6);
		
		assertThrows(IndexOutOfBoundsException.class,() -> {student.getNota(5);});
	}*/
}