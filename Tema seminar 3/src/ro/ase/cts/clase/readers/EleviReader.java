package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class EleviReader extends IReader {
	
	public EleviReader(String filePath) {
		super(filePath);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner fileContent = new Scanner(new File(super.filePath));
		fileContent.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<>();

		while (fileContent.hasNext()) {
			Elev elev = new Elev();
			super.citireAplicant(fileContent, elev);
			int clasa = fileContent.nextInt();
			String tutore = fileContent.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		fileContent.close();
		return elevi;
	}

}
