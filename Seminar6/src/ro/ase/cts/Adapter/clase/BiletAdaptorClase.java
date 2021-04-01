package ro.ase.cts.Adapter.clase;

public class BiletAdaptorClase extends Bilet implements IBiletOnline {

    public BiletAdaptorClase(float pret) {
        super(pret);
    }

    @Override
    public void vindeBiletOnline() {
        super.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        super.rezervare();
    }
}
