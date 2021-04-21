package ro.ase.cts.decorator.clase;

public class DecoratorCuPasteFericit extends DecoratorAbstract {


    public DecoratorCuPasteFericit(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("FELICITARE: Paste Fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("Paste Fericit!");

    }
}
