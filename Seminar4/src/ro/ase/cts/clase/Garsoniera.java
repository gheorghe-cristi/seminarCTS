package ro.ase.cts.clase;

public class Garsoniera {

	private String adresa;
	private float suprafata;
	private int anConstructie;
	
	
	private static Garsoniera instance = null;
	
	private Garsoniera() {
		super();
		this.adresa = "Aleea Florilor";
		this.suprafata = 40;
		this.anConstructie = 1981;
	}

	private Garsoniera(String adresa, float suprafata, int anConstructie) {
		super();
		this.adresa = adresa;
		this.suprafata = suprafata;
		this.anConstructie = anConstructie;
	}
	
	public static synchronized Garsoniera getInstance(String adresa, float suprafata, int anConstructie) {
		if(instance == null) {
			instance = new Garsoniera(adresa, suprafata, anConstructie);
		}
		
		return instance;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Garsoniera [adresa=");
		builder.append(adresa);
		builder.append(", suprafata=");
		builder.append(suprafata);
		builder.append(", anConstructie=");
		builder.append(anConstructie);
		builder.append("]");
		return builder.toString();
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void setMetriPatrati(float suprafata) {
		this.suprafata = suprafata;
	}

	public void setAnBloc(int anConstructie) {
		this.anConstructie = anConstructie;
	}
	
}