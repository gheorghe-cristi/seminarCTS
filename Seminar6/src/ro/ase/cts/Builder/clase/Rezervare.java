package ro.ase.cts.Builder.clase;

public class Rezervare {

    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzicaPersonalizata;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancare, boolean areScaunErgonomic, boolean areBautura, boolean areMuzicaPersonalizata, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBautura = areBautura;
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public void setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancare=").append(areMancare);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBautura=").append(areBautura);
        sb.append(", areMuzicaPersonalizata=").append(areMuzicaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
