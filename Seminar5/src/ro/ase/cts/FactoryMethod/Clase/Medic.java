package ro.ase.cts.FactoryMethod.Clase;

public class Medic extends PersonalSpital {

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic: ");
        sb.append(super.getNume());
        return sb.toString();
    }
}
