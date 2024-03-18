package org.example.Heroes.Wizard;

import org.example.Heroes.BasicHero;

public abstract class Wizard extends BasicHero { // Волшебники
    public int healthRecover; // восстановление здоровья
    public Wizard(int id, int healthLevel, String name, String type,
                  int basicDamage, int initiative) {
        super(id, healthLevel, name, type, basicDamage, initiative);
        this.healthRecover = basicDamage;
    }
}
