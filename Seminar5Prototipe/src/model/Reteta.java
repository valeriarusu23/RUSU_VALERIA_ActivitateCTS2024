package model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta{
    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;
    private Double gramajMedicament;

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramajMedicament) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramajMedicament = gramajMedicament;
        Double suma=0.0;
        for (Double cantitate:compozitieMedicament.values()
        ) {
            suma=suma+cantitate;
        }
        if(suma<gramajMedicament+0.1 && suma>gramajMedicament+0.1){
            throw new RuntimeException("Gramaj incorect");
        }
    }

    private Reteta(){

    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public AbstractReteta cloneaza() {
        Reteta reteta=new Reteta();
        reteta.numeMedicament=this.numeMedicament;
        reteta.compozitieMedicament=new HashMap<>();
        for(String cheie:this.compozitieMedicament.keySet()){
            reteta.compozitieMedicament
                    .put(cheie,this.compozitieMedicament.get(cheie));
        }
        reteta.gramajMedicament=this.gramajMedicament;
        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compozitieMedicament=").append(compozitieMedicament);
        sb.append(", gramajMedicament=").append(gramajMedicament);
        sb.append('}');
        return sb.toString();
    }
}
