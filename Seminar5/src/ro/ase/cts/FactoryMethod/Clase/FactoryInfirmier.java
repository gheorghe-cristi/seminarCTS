package ro.ase.cts.FactoryMethod.Clase;

public class FactoryInfirmier implements AbstractFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Infirmier(nume);
    }
}