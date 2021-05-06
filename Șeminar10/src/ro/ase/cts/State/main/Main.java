package ro.ase.cts.State.main;

import ro.ase.cts.State.clase.Masa;

public class Main {

    public static void main(String[] args) {

        Masa masa1= new Masa(5);
        
        masa1.elibereazaMasa();

        masa1.rezervaMasa();
        
        masa1.rezervaMasa();
        
        masa1.ocupaMasa();

    }
}
