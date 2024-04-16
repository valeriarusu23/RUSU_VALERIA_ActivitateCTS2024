package clase;

public class ProxyBilet implements BiletAbstract{
    private BiletAbstract bilet;
    //ce se intampla daca se mod limita de varsta si este 16 dar nu 14?
    private static int varstaMinima = 14;

    public ProxyBilet(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public BiletAbstract getBilet() {
        return bilet;
    }

    public static int getVarstaMinima() {
        return varstaMinima;
    }

    public void setBilet(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public static void setVarstaMinima(int varstaMinima) {
        ProxyBilet.varstaMinima = varstaMinima;
    }

    @Override
    public void vanzareBilet(Client client) {
        if(client.getVarsta() >=varstaMinima){
            this.bilet.vanzareBilet(client);

        }else{
            System.out.println("Nu ai voie sa cumperi bilet. ");
        }
    }
}
