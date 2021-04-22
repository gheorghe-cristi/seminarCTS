package ro.ase.cts.Flyweight.clase;

public class Client implements Flyweight{
	private String nume;
	private String nrTel;
	private String email;

	public Client(String nume, String nrTel, String email) {
		super();
		this.nume = nume;
		this.nrTel = nrTel;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", nrTel=");
		builder.append(nrTel);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println(this.toString()+" " + rezervare.toString());	
	}

}
