package org.example.Heroes.Infantry;

import org.example.Heroes.BasicHero;

public abstract class Infantry extends BasicHero { // Пехота
    static Integer localId = 200;

    public Infantry(int healthLevel, String name, String type, int basicDamage, int initiative) {
        super(healthLevel, name, type, basicDamage, initiative);
        super.setId(localId++);

    }
    public void setLocalId(){
        super.setId(localId++);
    }
}
