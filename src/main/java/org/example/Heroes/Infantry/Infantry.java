package org.example.Heroes.Infantry;

import org.example.Heroes.BasicHero;

public abstract class Infantry extends BasicHero { // Пехота

    public Infantry(int id, int healthLevel, String name, String type, int basicDamage, int initiative) {
        super(id, healthLevel, name, type, basicDamage, initiative);

    }
}
