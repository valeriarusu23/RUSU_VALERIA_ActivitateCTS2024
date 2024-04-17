package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta{
    private List<StructuraAbstracta>medicamente;
    private String denumire;

    public Categorie(String denumire) {

        this.medicamente = new ArrayList<>();
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }


    @Override
    public void adaugaCategorie(StructuraAbstracta sa) {
        this.medicamente.add(sa);
    }

    @Override
    public void stergeCategorie(StructuraAbstracta sa) {
        this.medicamente.remove(sa);
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        if(index>=0 && index<this.medicamente.size()){
            return this.medicamente.get(index);
        }
        else{
            return null;
        }
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare + "Categoria " + this.denumire + " are urmatoarele subcategorii ");
        for(StructuraAbstracta sa : medicamente){
            sa.afisareProspect(indentare + "     ");
        }
    }

    public void calculeazaPret(double procentDiscount){
        for(StructuraAbstracta sa : medicamente){
            sa.calculeazaPret(procentDiscount);
        }
    }

}
