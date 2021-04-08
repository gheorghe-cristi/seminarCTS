package ro.ase.cts.composite.clase;

public class Filiala implements ISediu{

	private String numeFiliala;
	
	public Filiala(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Filiala " + numeFiliala);
	}

	@Override
	public void adaugaNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementata");
	}

	@Override
	public void stergeNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementata");
	}

	@Override
	public ISediu getNod(int pos) throws Exception {
		throw new Exception("Nu este implementata");
	}

}
