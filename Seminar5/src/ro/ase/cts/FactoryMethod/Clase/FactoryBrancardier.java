package ro.ase.cts.FactoryMethod.Clase;

public class FactoryBrancardier implements AbstractFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}