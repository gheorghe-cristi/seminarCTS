package ro.ase.cts.SimpleFactory.Clase;

public class FactoryPersonal {

    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume){
        switch(tipPersonal){
            case Asistent:
                return new Asistent(nume);
            case Brancardier:
                return new Brancardier(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException();
        }

    }
}
