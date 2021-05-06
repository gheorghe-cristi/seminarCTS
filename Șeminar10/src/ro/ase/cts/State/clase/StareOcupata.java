package ro.ase.cts.State.clase;

public class StareOcupata implements Stare {
    @Override
    public void modificaStare(Masa masa) {

        if(!(masa.getStare() instanceof StareOcupata)){
            masa.setStare(this);
            System.out.println("Masa cu nr "+ masa.getNumar() +" a fost ocupata");
        }
        else{
            System.out.println("Masa cu nr "+ masa.getNumar() +" nu poate fi ocupata!");
        }
    }
}
