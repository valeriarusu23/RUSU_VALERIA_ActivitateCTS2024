package main;

import clase.Flyweight;
import clase.FlyweightFactory;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Reteta reteta1 = new Reteta("Reteta1", 12, 3);
        Reteta reteta2 = new Reteta("Reteta2", 10, 1);
        Reteta reteta3 = new Reteta("Reteta3", 9, 2);
        Reteta reteta4 = new Reteta("Reteta4", 42, 7);
        Reteta reteta5 = new Reteta("Reteta5", 108, 8);

        Flyweight client = flyweightFactory.getClient("1234567", "Gigel");
        client.achizitionareReteta(reteta1);
        flyweightFactory.getClient("1234567", "Gigel").achizitionareReteta(reteta2);
        flyweightFactory.getClient("87654321", "Ionel").achizitionareReteta(reteta5);
        client.achizitionareReteta(reteta3);
    }
}