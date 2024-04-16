package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet1 = new Bilet("A", "B", 10.0);
        Client client1 = new Client(13, "Popescu");
        bilet1.vanzareBilet(client1);

        BiletAbstract bilet2 = new ProxyBilet(bilet1);
        bilet2.vanzareBilet(client1);

        Client client2 = new Client(18, "Ionescu");
        bilet2.vanzareBilet(client2);

        BiletAbstract bilet3 = new ProxyBiletSector(bilet1);
        ProxyBiletSector.adaugaLitere('P');
        bilet3.vanzareBilet(client1);
        bilet3.vanzareBilet(client2);

        System.out.println("--------------------------------");
        BiletAbstract bilet4 = new ProxyBilet(bilet3);
        bilet4.vanzareBilet(client1);
        bilet4.vanzareBilet(client2);

    }
}

//ce se intampla daca se mod limita de varsta si este 16 dar nu 14?

//intrarea pe stadion se face pe sectoare
//cei cu litera a se duc la litera a, popescu cu p se duce la litera P
//facem un nou proxy