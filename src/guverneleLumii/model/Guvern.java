package guvernelelumii.model;

public class Guvern {
    private String numeTara;
    private String numePrimMinistru;
    private int nrGuvernatori;

    public Guvern(String numeTara, String numePrimMinistru, int nrGuvernatori) {
        this.numeTara = numeTara;
        this.numePrimMinistru = numePrimMinistru;
        this.nrGuvernatori = nrGuvernatori;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public void setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    @Override
    public String toString() {
        return "Guvern{" +
                "numeTara='" + numeTara + '\'' +
                ", numePrimMinistru='" + numePrimMinistru + '\'' +
                ", nrGuvernatori=" + nrGuvernatori +
                '}';
    }
}
