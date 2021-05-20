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
}