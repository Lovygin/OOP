package heroes;

import interfaces.InGameInterface;
import unitLocation.Coordinates;


import java.util.ArrayList;

public abstract class BasicHero implements InGameInterface {
    private int id;
    protected int healthLevel;
    protected String name;
    protected String type;
    protected int basicDamage;
    protected int initiative; // Порядок хода
    protected Coordinates place = new Coordinates();
    protected float distanceToNearestEnemy = 1000;
    protected String state = ""; // Статус

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
    public Coordinates getPlace(){ return place;}

    public int getBasicDamage() {
        return basicDamage;
    }

    public int getInitiative() {
        return initiative;
    }
    public void setHealthLevel(int healthLevelOrDamage){
        this.healthLevel = healthLevelOrDamage;
    }

    public float getDistanceToNearestEnemy() {
        return distanceToNearestEnemy;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @param enemies, friends
     * @return int[indexOfNeededEnemyInTeam, minDistance]
     */
    protected BasicHero findNearestEnemy(ArrayList<BasicHero> enemies) {
        //float minDistance = 1000;
        int indexOfPositionInTeamOfNeededEnemy = 0;
        for (int i = 0; i < enemies.size(); i++) {
            float length = place.calcDistance(enemies.get(i).place);
            if (length < this.distanceToNearestEnemy) {
                this.distanceToNearestEnemy = length;
                indexOfPositionInTeamOfNeededEnemy = i;
            }
        }
        return enemies.get(indexOfPositionInTeamOfNeededEnemy);
    }

}
