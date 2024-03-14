package FactoryMethod.main;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.fabrici.FabricaAsistent;
import FactoryMethod.fabrici.FabricaInfirmier;
import FactoryMethod.fabrici.FabricaMedic;
import FactoryMethod.fabrici.FactoryAngajati;

public class Main {
    public static void main(String[] args) {
        FactoryAngajati factoryAngajati = new FabricaAsistent();
        procesareAnagajat(factoryAngajati, "Rares", 10000);
        procesareAnagajat(new FabricaMedic(), "Alex", 1000);
        procesareAnagajat(new FabricaInfirmier(), "Florin", 1000);

    }

    public static void procesareAnagajat(FactoryAngajati factory, String nume, int salariu){
        PersonalSpital angajat = factory.creareAngajat("Valeria", 10000);
        angajat.afisare();
    }
}
