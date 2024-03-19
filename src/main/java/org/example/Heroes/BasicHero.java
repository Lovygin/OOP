package org.example.Heroes;

import java.util.HashMap;
import java.util.Map;

public abstract class BasicHero {
    private int id;
    int healthLevel;
    String name;
    String type;
    int basicDamage;
    int initiative; // Порядок хода

    public BasicHero(int healthLevel, String name, String type, int basicDamage, int initiative) {
        //this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.basicDamage = basicDamage;
        this.initiative = initiative;
    }

    public void setId(int id){
        this.id = id;
    }


}
