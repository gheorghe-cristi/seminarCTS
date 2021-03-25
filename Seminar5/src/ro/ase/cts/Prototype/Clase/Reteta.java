package ro.ase.cts.Prototype.Clase;

public class Reteta implements AbstractPrototype{

    private String denumireSolutie;
    private int cantitateSolutie;

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    private Reteta() {
        this.denumireSolutie="";
        this.cantitateSolutie=0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta: ");
        sb.append("denumireSolutie: ").append(denumireSolutie);
        sb.append(", cantitateSolutie: ").append(cantitateSolutie);
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copie=new Reteta();

        copie.cantitateSolutie=this.cantitateSolutie;
        copie.denumireSolutie=this.denumireSolutie;

        return copie;
    }
}
