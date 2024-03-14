package program;

import clase.FactoryPersonal;
import clase.PersonalSpital;
import clase.TipAngajat;

public class Main {
    public static void main (String[] args){
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.creareAngajat(TipAngajat.MEDIC, "Ionel", 12, 3);
        //afisare
        medic.afisare();
        PersonalSpital asistent = factoryPersonal.creareAngajat(TipAngajat.ASISTENT, "Valeria", 10, 2);
        asistent.afisare();
    }
}
