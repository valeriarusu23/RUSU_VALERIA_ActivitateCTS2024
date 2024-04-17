package clase;

public interface StructuraAbstracta {


    public void adaugaCategorie(StructuraAbstracta sa);
    public void stergeCategorie(StructuraAbstracta sa);
    public StructuraAbstracta getCategorie(int index);
    public void afisareProspect(String indentare);
    public void calculeazaPret(double procentDiscount);
}
