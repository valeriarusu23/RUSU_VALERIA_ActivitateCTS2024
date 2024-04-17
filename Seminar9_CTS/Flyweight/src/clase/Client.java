package clase;

public class Client implements Flyweight{
    private String nume;
    private String numerAsigurare;

    public Client(String nume, String numarAsigurare) {
        this.nume = nume;
        this.numerAsigurare = numarAsigurare;
    }


    @Override
    public void achizitionareReteta(Reteta reteta) {
        System.out.println(
                "Clientul " +this.nume + "cu numarul de asigurare" + this.numerAsigurare+
                        " achizitioneaza reteta" +reteta.toString());
    }
}
