package ro.ase.cts.Adapter.main;

import ro.ase.cts.Adapter.clase.Bilet;
import ro.ase.cts.Adapter.clase.BiletAdaptorClase;
import ro.ase.cts.Adapter.clase.BiletAdaptorObiect;
import ro.ase.cts.Adapter.clase.IBiletOnline;


public class Main {

    private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }
    private static void rezervaSiAfiseazaBiletOnline(IBiletOnline biletOnline){
        biletOnline.rezervaBiletOnline();
        biletOnline.vindeBiletOnline();
    }
    public static void main(String[] args) {

        Bilet bilet= new Bilet(30);
        rezervaSiAfiseazaBiletLaCasa(bilet);

        IBiletOnline biletAdaptat = new BiletAdaptorObiect(bilet);
        rezervaSiAfiseazaBiletOnline(biletAdaptat);

        IBiletOnline biletAdaptatClase=new BiletAdaptorClase(50);
        rezervaSiAfiseazaBiletOnline(biletAdaptatClase);
    }
}
