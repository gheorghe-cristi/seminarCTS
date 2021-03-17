package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatiReader extends IReader {

	public AngajatiReader(String filePath) {
		super(filePath);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner fileContent = new Scanner(new File(super.filePath));
		fileContent.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (fileContent.hasNext()) {
			Angajat angajat = new Angajat();
			super.citireAplicant(fileContent, angajat);
			int salariu = fileContent.nextInt();
			String ocupatie = fileContent.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		fileContent.close();
		return angajati;
	}

}
