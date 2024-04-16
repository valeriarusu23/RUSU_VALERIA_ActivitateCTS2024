package clase;

public class Client {
    private int varsta;
    private String numeClient;

    public Client(int varsta, String numeClient) {
        this.varsta = varsta;
        this.numeClient = numeClient;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("varsta=").append(varsta);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
