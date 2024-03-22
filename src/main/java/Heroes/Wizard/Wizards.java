package Heroes.Wizard;

import Heroes.BasicHero;

import java.util.ArrayList;

public abstract class Wizards extends BasicHero { // Волшебники
    static Integer localId = 100;
    public int healthRecover; // восстановление здоровья
    public Wizards(int healthLevel, String name, String type,
                   int basicDamage, int initiative, int x, int y) {
        super(healthLevel, name, type, basicDamage, initiative, x, y);
        this.healthRecover = basicDamage;
    }
    protected void setLocalId(){
        super.setId(localId++);
    }
    protected void cast(){}

    public void step(ArrayList<BasicHero> enemies) {
        int [] outputData = findNearestEnemy(enemies);
        System.out.println("For " + getType() + " " + getName() + " the minimum distance to the enemy: |" +
                enemies.get(outputData[0]).getInfo() + "| = " + outputData[1]);
    }
}
