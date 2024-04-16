package bilete.decoratoare;

import bilete.clase.Bilet;
import bilete.clase.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {
    private BiletAbstract biletAbstract;
    public DecoratorBilet(String echipaGazda, String echipaOaspeti, double pretBilet) {
        super(echipaGazda, echipaOaspeti, pretBilet);
        this.biletAbstract = new Bilet(echipaGazda, echipaOaspeti, pretBilet);
    }


    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }

    public void setBiletAbstract(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    public DecoratorBilet(BiletAbstract biletDecorat){
        super(biletDecorat.getEchipaGazda(), biletDecorat.getEchipaOaspeti(), biletDecorat.getPretBilet());
        this.biletAbstract = biletDecorat;
    }

    public abstract void aplicaDiscountBilet();
}
