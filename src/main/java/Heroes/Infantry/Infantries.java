package Heroes.Infantry;

import Heroes.BasicHero;

import java.util.ArrayList;

public abstract class Infantries extends BasicHero { // Пехота
    static Integer localId = 200;

    public Infantries(int healthLevel, String name, String type, int basicDamage, int initiative, int x, int y) {
        super(healthLevel, name, type, basicDamage, initiative, x, y);
        super.setId(localId++);

    }
    protected void setLocalId(){
        super.setId(localId++);
    }

    protected void attack(){}
    protected void protection(){}

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int [] outputData = findNearestEnemy(enemies);
        System.out.println("For " + getType() + " " + getName() + " the minimum distance to the enemy: |" +
                enemies.get(outputData[0]).getInfo() + "| = " + outputData[1]);
    }
}
