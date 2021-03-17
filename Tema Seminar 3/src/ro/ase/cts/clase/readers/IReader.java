package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {
	protected String filePath;
	
	public IReader(String filePath) {
		super();
		this.filePath = filePath;
	}

	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException; 
	
	public void citireAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nrProiecte = input.nextInt();
		String[] vectDenumiriProiecte = new String[nrProiecte];
		for (int i = 0; i < nrProiecte; i++)
			vectDenumiriProiecte[i] = input.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setVectorDenumiri(vectDenumiriProiecte,nrProiecte);
		
	}
}
