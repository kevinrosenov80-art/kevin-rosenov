package joc;

public class Human extends Player {

    public Human(String name, int attack, int defense, int life) {
        super(name, attack, defense, life);
        System.out.println("Creo Human");
    }
}