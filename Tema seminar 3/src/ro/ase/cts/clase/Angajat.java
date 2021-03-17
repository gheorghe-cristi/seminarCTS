package ro.ase.cts.clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantare=10;
	
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	public float getSumaFinantata() {
		return sumaFinantare;
	}
	
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Angajat: ").append(super.toString()).append("Ocupatie: ")
		.append(ocupatie).append(",salariu: ").append(salariu);
		
		return stringBuilder.toString();
	}
}
