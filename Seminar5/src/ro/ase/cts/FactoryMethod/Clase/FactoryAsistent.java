package ro.ase.cts.FactoryMethod.Clase;

public class FactoryAsistent implements AbstractFactory{

    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
