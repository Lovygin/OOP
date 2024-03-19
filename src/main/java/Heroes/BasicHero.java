package Heroes;

import Interfaces.InGameInterface;

import java.util.HashMap;
import java.util.Map;

public abstract class BasicHero implements InGameInterface {
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

    public int getId() {
        return id;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getBasicDamage() {
        return basicDamage;
    }

    public int getInitiative() {
        return initiative;
    }
}
