package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantare = 30;
	
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAn_studii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();
	}
	
	@Override
	public String toString() {
			StringBuilder stringBuilder =new StringBuilder();
			stringBuilder.append("Student: ").append(super.toString()).append("Facultate: ")
			.append(facultate).append("An studii: ").append(anStudii);
			return stringBuilder.toString();
	}
}
