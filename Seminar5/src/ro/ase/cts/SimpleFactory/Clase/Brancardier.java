package ro.ase.cts.SimpleFactory.Clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier: ");
        sb.append(super.getNume());
        return sb.toString();
    }
}
