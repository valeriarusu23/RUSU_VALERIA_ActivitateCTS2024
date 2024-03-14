package FactoryMethod.clase;



public class Medic extends PersonalSpital {
    private int vechime;
    public Medic(String nume, int salariu) {
        super(nume, salariu);
        this.vechime = 0;
    }

    public Medic(String nume, int salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }


    @Override
    public void afisare() {
        System.out.println("Infirmierul " +super.getNume() +"  are salariul de  " +super.getSalariu());
    }
}
