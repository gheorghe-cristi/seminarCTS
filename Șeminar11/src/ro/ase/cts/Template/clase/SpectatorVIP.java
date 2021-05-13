package ro.ase.cts.Template.clase;

public class SpectatorVIP extends SpectatorAbstract{
	private String nume;

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul " + this.nume + " nu a stat in coada.");
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Spectatorul " + this.nume + " a prezentat biletul VIP.");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorul " + this.nume + " a fost controlat.");
	}

	@Override
	public void ocupareLoc() {
		System.out.println("Spectatorul " + this.nume + " a ocupat locul in loja.");
	}

}
