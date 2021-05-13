package ro.ase.cts.Observer.clase;

public class Client implements Observator{
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void receptioneazaMesaj(String mesaj) {
		System.out.println(this.nume + " a fost notificat cu mesajul: " + mesaj );
	}

}
