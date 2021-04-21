package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorCuPasteFericit;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

    public static void main(String[] args) {

        NotaDePlata notaInitiala = new NotaDePlata(40);
        notaInitiala.printeaza();
        System.out.println();

        DecoratorAbstract decoratorLaMultiAni=new DecoratorCuLaMultiAni(notaInitiala);
        decoratorLaMultiAni.printeazaFelicitare();
        System.out.println();
        decoratorLaMultiAni.printeaza();

        System.out.println();
        DecoratorAbstract decoratorCuPasteFericit=new DecoratorCuPasteFericit(notaInitiala);
        decoratorCuPasteFericit.printeaza();

        System.out.println();
        NotaDePlata notaDePlataCuDouaMesaje =new NotaDePlata(60);
        DecoratorAbstract decoratorLaMultiAni2=new DecoratorCuLaMultiAni(notaDePlataCuDouaMesaje);
        DecoratorAbstract decoratorCuPasteFericit2=new DecoratorCuPasteFericit(decoratorLaMultiAni2);
        decoratorCuPasteFericit2.printeaza();

    }
}
