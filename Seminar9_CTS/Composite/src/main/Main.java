package main;

import clase.Categorie;
import clase.Medicament;
import clase.StructuraAbstracta;

import java.awt.dnd.DragGestureEvent;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta medicamente = new Categorie("Medicamente");
        StructuraAbstracta  raceala = new Categorie("Raceala");
        StructuraAbstracta durere = new Categorie("Durere");

        StructuraAbstracta copii = new Categorie("Copii");
        StructuraAbstracta adulti = new Categorie("Adulti");

        StructuraAbstracta nurofen = new Medicament("Nurofen", 15.0);
        StructuraAbstracta paracetamol = new Medicament("Paracetamol", 10.0);
        StructuraAbstracta mig400 = new Medicament("Mig400", 20.0);
        StructuraAbstracta nurofenJunior = new Medicament("NurofenJunior", 30.);

        medicamente.adaugaCategorie(raceala);
        medicamente.adaugaCategorie(durere);

        raceala.adaugaCategorie(copii);
        raceala.adaugaCategorie(adulti);

        durere.adaugaCategorie(mig400);

        adulti.adaugaCategorie(nurofen);
        adulti.adaugaCategorie(nurofenJunior);
        adulti.adaugaCategorie(paracetamol);

        medicamente.afisareProspect(" ");

        raceala.calculeazaPret(0.1);
        medicamente.afisareProspect(" ");
    }
}

//problema 9 pag 6/13  (      PROXY    )

