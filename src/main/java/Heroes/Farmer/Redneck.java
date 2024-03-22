package Heroes.Farmer;

import Heroes.BasicHero;

import java.util.ArrayList;

public class Redneck extends BasicHero {
    static Integer localId = 400;

    public Redneck(String name, int x, int y) {
        super(15, name, "Redneck", 1, 2, x, y);
        super.setId(localId++);
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Basic damage = " + getBasicDamage() + "; " +
                "Initiative: " + getInitiative() + "; " +
                "Position: " + this.getPlace().getX() + ":" + this.getPlace().getY();
    }

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int [] outputData = findNearestEnemy(enemies);
        System.out.println("For " + getType() + " " + getName() + " the minimum distance to the enemy: |" +
                enemies.get(outputData[0]).getInfo() + "| = " + outputData[1]);
    }
    protected void support() {
    }

}
