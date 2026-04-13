package inici;

import joc.*;

public class JocDeRol {

    public static void main(String[] args) {

        Player p1 = new Human("Juan", 10, 5, 30);
        Player p2 = new Warrior("Pedro", 12, 6, 40);
        Player p3 = new Alien("Zorg", 15, 3, 25);

        p1.attack(p3);
        p2.attack(p1);
    }
}