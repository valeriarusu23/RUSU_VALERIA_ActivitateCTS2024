package bilete.decoratoare;

import bilete.clase.BiletAbstract;

public class BiletNational extends DecoratorBilet{
    private double valoareDiscount =0.85;
    public BiletNational(String echipaGazda, String echipaOaspeti, double pretBilet) {
        super(echipaGazda, echipaOaspeti, pretBilet);
    }

    public BiletNational(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println("MultSucces " +this.getEchipaOaspeti()+ "!" );
    }

    @Override
    public void aplicaDiscountBilet() {

        this.getBiletAbstract().setPretBilet(this.getBiletAbstract().getPretBilet()*valoareDiscount);
    }
}
