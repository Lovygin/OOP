package Heroes;

import Interfaces.InGameInterface;
import Location.Coordinates;


import java.util.ArrayList;
import java.util.HashMap;

public abstract class BasicHero implements InGameInterface {
    private int id;
    int healthLevel;
    String name;
    String type;
    int basicDamage;
    int initiative; // Порядок хода
    public Coordinates place = new Coordinates();

    public BasicHero(int healthLevel, String name, String type, int basicDamage, int initiative, int x, int y) {
        //this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.basicDamage = basicDamage;
        this.initiative = initiative;
        this.place.setX(x);
        this.place.setY(y);

    }

    protected void setId(int id) {
        this.id = id;
    }

    protected int getId() {
        return id;
    }

    protected int getHealthLevel() {
        return healthLevel;
    }

    protected String getName() {
        return name;
    }

    protected String getType() {
        return type;
    }

    protected int getBasicDamage() {
        return basicDamage;
    }

    protected int getInitiative() {
        return initiative;
    }

    protected Coordinates getPlace() {
        return place;
    }

    /**
     *
     * @param enemies
     * @return int[indexOfNeededEnemyInTeam, minDistance]
     */
    protected int[] findNearestEnemy(ArrayList<BasicHero> enemies) {
        float minDistance = 1000;
        int indexOfPositionInTeamOfNeededEnemy = 0;
        for (int i = 0; i < enemies.size(); i++) {
            float length = place.calcDistance(enemies.get(i).place);
            if (length < minDistance) {
                minDistance = length;
                indexOfPositionInTeamOfNeededEnemy = i;
            }
        }
        return new int[]{indexOfPositionInTeamOfNeededEnemy, (int) minDistance};
    }
}
