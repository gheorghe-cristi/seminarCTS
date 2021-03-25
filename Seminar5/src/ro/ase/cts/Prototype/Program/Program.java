package ro.ase.cts.Prototype.Program;

import ro.ase.cts.Prototype.Clase.Reteta;

public class Program {
    public static void main(String[] args) {

        Reteta reteta1= new Reteta("Ibuprofen",200);

        Reteta reteta2=(Reteta) reteta1.copiaza();

        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());
    }
}
