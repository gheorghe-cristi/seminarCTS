package ro.ase.cts.SimpleFactory.Program;

import ro.ase.cts.SimpleFactory.Clase.FactoryPersonal;
import ro.ase.cts.SimpleFactory.Clase.PersonalSpital;
import ro.ase.cts.SimpleFactory.Clase.TipPersonal;

public class Program {

	 public static void main(String[] args) {

	        FactoryPersonal factoryPersonal=new FactoryPersonal();

	        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent,"George");
	        PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,"Ion");

	        System.out.println(asistent.toString());
	        System.out.println(medic.toString());
	    }
}
