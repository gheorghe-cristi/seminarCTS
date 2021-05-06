package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;

public class Main {
    public static void main(String[] args) {

        Client client1= new Client("Cristi");
        client1.plateste(70);


        client1.setTipPlata(new PlataCard());
        client1.plateste(150);

    }

}
