package heroes.Shooters;

import heroes.BasicHero;
import heroes.Farmer.Redneck;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero { // Стрелок
    int shotLength; // Длина выстрела
    int shootsCapacity;
    static Integer localId = 300;

    public Shooters(int healthLevel, String name, String type, int basicDamage, int initiative,
                    int shotLength, int shootsCapacity, int x, int y) {
        super(healthLevel, name, type, basicDamage, initiative, x, y);
        this.shotLength = shotLength;
        this.shootsCapacity = shootsCapacity;
    }

    protected void setLocalId() {
        super.setId(localId++);
    }

    protected void reArm() {
    }

    protected void fire() {
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        if ((getHealthLevel() < 1) || shootsCapacity < 1) { return; // out from the method
        }
        BasicHero nearestEnemy = findNearestEnemy(enemies);
        nearestEnemy.setHealthLevel(nearestEnemy.getHealthLevel() - this.getBasicDamage());
        System.out.print(getType() + " " + getName() + " shoots to |" + nearestEnemy.getInfo() + "|. ");
        for (BasicHero friend : friends) {
            if(friend.getType().equals("Redneck")){ // Farmer/redneck fill in(заполняет, приносит) shoots
                System.out.println("His/Her shoots capacity = " + shootsCapacity);
                return;
            }
        }
        this.shootsCapacity--;
        System.out.println("His/Her shoots capacity = " + shootsCapacity);
    }
}
