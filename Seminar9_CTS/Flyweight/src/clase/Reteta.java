package clase;

public class Reteta {
    private String numeReteta;
    private int suma;
    private int nrMedicamente;

    public Reteta(String numeReteta, int suma, int nrMedicamente) {
        this.numeReteta = numeReteta;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public String getNumeReteta() {
        return numeReteta;
    }

    public int getSuma() {
        return suma;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeReteta='").append(numeReteta).append('\'');
        sb.append(", suma=").append(suma);
        sb.append(", nrMedicamente=").append(nrMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
