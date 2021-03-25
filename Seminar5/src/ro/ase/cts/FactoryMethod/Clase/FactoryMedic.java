package ro.ase.cts.FactoryMethod.Clase;

public class FactoryMedic implements AbstractFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}