package bilete.clase;

public abstract class BiletAbstract {
    private  String echipaGazda;
    private String echipaOaspeti;
    private double pretBilet;

    public BiletAbstract(String echipaGazda, String echipaOaspeti, double pretBilet) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspeti = echipaOaspeti;
        this.pretBilet = pretBilet;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public String getEchipaOaspeti() {
        return echipaOaspeti;
    }

    public void setEchipaOaspeti(String echipaOaspeti) {
        this.echipaOaspeti = echipaOaspeti;
    }

    public double getPretBilet() {
        return pretBilet;
    }

    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletAbstract{");
        sb.append("echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspeti='").append(echipaOaspeti).append('\'');
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }

    public abstract  void printareBilet();
}
