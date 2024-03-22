package Heroes.Shooters;

import Heroes.BasicHero;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero { // Стрелок
    int shotLength; // Длина выстрела
    int capacity;
    static Integer localId = 300;
    public Shooters(int healthLevel, String name, String type, int basicDamage, int initiative,
                    int shotLength, int capacity, int x, int y) {
        super(healthLevel, name, type, basicDamage, initiative, x, y);
        this.shotLength = shotLength;
        this.capacity = capacity;
    }
    protected void setLocalId() {
        super.setId(localId++);
    }
    protected void reArm(){}
    protected void fire(){}

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int [] outputData = findNearestEnemy(enemies);
        System.out.println("For " + getType() + " " + getName() + " the minimum distance to the enemy: |" +
                enemies.get(outputData[0]).getInfo() + "| = " + outputData[1]);
    }
}
