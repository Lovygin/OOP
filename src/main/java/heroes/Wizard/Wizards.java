package heroes.Wizard;

import heroes.BasicHero;

import java.util.ArrayList;

public abstract class Wizards extends BasicHero { // Волшебники
    static Integer localId = 100;
    public int healthRecover; // восстановление здоровья
    public Wizards(int healthLevel, String name, String type,
                   int basicDamage, int initiative, int x, int y) {
        super(healthLevel, name, type, basicDamage, initiative, x, y);
        super.setState("ready");
        this.healthRecover = basicDamage;
    }
    protected void setLocalId(){
        super.setId(localId++);
    }
    protected void cast(){}

    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        BasicHero nearestEnemy = findNearestEnemy(enemies);
        System.out.println(getType() + " " + getName() + " has a minimum distance ("
                + (int)getDistanceToNearestEnemy() + ") to |" +
                nearestEnemy.getInfo() + "|");
    }
}
