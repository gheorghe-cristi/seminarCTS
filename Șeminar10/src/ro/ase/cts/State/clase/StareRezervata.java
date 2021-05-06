package ro.ase.cts.State.clase;

public class StareRezervata implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            masa.setStare(this);
            System.out.println("Masa cu nr "+masa.getNumar()+" a fost rezervata!");
        }
        else{
            System.out.println("Masa cu nr "+ masa.getNumar() +" nu poate fi rezervata!");
        }

    }
}
