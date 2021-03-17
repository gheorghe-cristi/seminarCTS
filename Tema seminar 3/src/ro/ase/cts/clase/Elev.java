package ro.ase.cts.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare = 30;
	
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	public float getSumaFinantata() {
		return sumaFinantare;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder =new StringBuilder();
		stringBuilder.append("Elev: ").append(super.toString()).append("Clasa: ")
		.append(clasa).append("Tutore: ").append(tutore);
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}
}
