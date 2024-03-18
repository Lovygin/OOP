package org.example;

public abstract class Wizard extends BasicHero { // Маги
    public int healthRecover; // восстановление здоровья
    public Wizard(int id, int healthLevel, String name, String type,
                  int basicDamage, int initiative, int healthRecover) {
        super(id, healthLevel, name, type, basicDamage, initiative);
        this.healthRecover = healthRecover;
    }
}
