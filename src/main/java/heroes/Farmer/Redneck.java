package heroes.Farmer;

import heroes.BasicHero;

import java.util.ArrayList;

public class Redneck extends BasicHero {
    static Integer localId = 400;

    public Redneck(String name, int x, int y) {
        super(30, name, "Redneck", 1, 1, x, y);
        super.setId(localId++);
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Basic damage = " + getBasicDamage() + "; " +
                "Initiative: " + getInitiative() + "; " +
                "Position: " + this.place.getX() + ":" + this.place.getY();
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        BasicHero nearestEnemy = findNearestEnemy(enemies);
        System.out.println(getType() + " " + getName() + " has a minimum distance ("
                + (int)getDistanceToNearestEnemy() + ") to |" +
                nearestEnemy.getInfo() + "|");

    }
    protected void support() {
    }

}
