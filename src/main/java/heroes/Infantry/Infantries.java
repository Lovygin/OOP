package heroes.Infantry;

import heroes.BasicHero;

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
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        BasicHero nearestEnemy = findNearestEnemy(enemies);
        System.out.println(getType() + " " + getName() + " has a minimum distance ("
                + (int)getDistanceToNearestEnemy() + ") to |" +
                nearestEnemy.getInfo() + "|");
    }
}
