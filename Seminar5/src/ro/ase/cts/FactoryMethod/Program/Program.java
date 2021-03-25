package ro.ase.cts.FactoryMethod.Program;

import ro.ase.cts.FactoryMethod.Clase.AbstractFactory;
import ro.ase.cts.FactoryMethod.Clase.FactoryAsistent;
import ro.ase.cts.FactoryMethod.Clase.FactoryBrancardier;
import ro.ase.cts.FactoryMethod.Clase.FactoryInfirmier;
import ro.ase.cts.FactoryMethod.Clase.PersonalSpital;

public class Program {

    public static void afisareInfoPersonalSpital(AbstractFactory factory, String nume){

        PersonalSpital PersonalSpital=factory.getPersonal(nume);

        System.out.println(PersonalSpital.toString());
    }
    public static void main(String[] args) {

        afisareInfoPersonalSpital(new FactoryAsistent() ,"Gigel");
        afisareInfoPersonalSpital(new FactoryBrancardier() ,"Ionel");
        afisareInfoPersonalSpital(new FactoryInfirmier() ,"Sandel");
    }
}