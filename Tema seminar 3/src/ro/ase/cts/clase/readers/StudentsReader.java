package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentsReader extends IReader {
	
	public StudentsReader(String filePath) {
		super(filePath);
	}

	public  List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
		Scanner fileContent = new Scanner(new File(super.filePath));
		fileContent.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<>();

		while (fileContent.hasNext()) {
			Student student = new Student();
			super.citireAplicant(fileContent, student);
			int anStudii = fileContent.nextInt();
			String facultate = (fileContent.next()).toString();
			student.setAn_studii(anStudii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		fileContent.close();
		return studenti;
	}

}
