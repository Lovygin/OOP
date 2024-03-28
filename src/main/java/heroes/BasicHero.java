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
    protected float distanceToNearestUnit = 1000;
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
        return distanceToNearestUnit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @param units - enemies or friends.
     * @return int[indexOfNeededEnemyInTeam, minDistance]
     */
    protected BasicHero findNearestUnit(ArrayList<BasicHero> units) {
        int indexOfNeededUnitInTeam = 12;
        for (int i = 0; i < units.size(); i++) {
            float length = place.calcDistance(units.get(i).place);
            if (length < this.distanceToNearestUnit) {
                this.distanceToNearestUnit = length;
                indexOfNeededUnitInTeam = i;
            }
        }
        return units.get(indexOfNeededUnitInTeam);
    }

}
