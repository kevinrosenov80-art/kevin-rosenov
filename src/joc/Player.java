package joc;

public class Player {

    String name;
    int attack;
    int defense;
    int life;

    public Player(String name, int attack, int defense, int life) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.life = life;

        System.out.println("Creo Player");
    }

    public void attack(Player p) {

        p.hit(this.attack);

        if (p.life > 0) {
            this.hit(p.attack);
        }
    }

    public void hit(int attack) {

        int damage = attack - defense;
        if (damage < 0) damage = 0;

        life = life - damage;
        if (life < 0) life = 0;

        System.out.println(name + " pierde " + damage);
    }

    public String toString() {
        return name + " vida:" + life;
    }
}