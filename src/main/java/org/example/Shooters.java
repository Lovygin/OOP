package org.example;

public abstract class Shooters extends BasicHero {
    int shotLength;
    public Shooters(int id, int healthLevel, String name, int type, int basicDamage, int initiative) {
        super(id, healthLevel, name, type, basicDamage, initiative);
    }
}
