package ro.ase.cts.SimpleFactory.Clase;

public abstract class PersonalSpital {
    private String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
