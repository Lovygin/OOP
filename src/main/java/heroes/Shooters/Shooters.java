package heroes.Shooters;

import heroes.BasicHero;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero { // Стрелок
    int shotLength; // Длина выстрела
    int shootsCapacity;
    static Integer localId = 300;

    public Shooters(int healthLevel, String name, String type, int basicDamage, int initiative,
                    int shotLength, int shootsCapacity, int x, int y) {
        super(healthLevel, name, type, basicDamage, initiative, x, y);
        super.setState("ready");
        this.shotLength = shotLength;
        this.shootsCapacity = shootsCapacity;
    }

    protected void setLocalId() {
        super.setId(localId++);
    }

    protected void reArm() {
        super.setState("ready");
        System.out.println("His/Her shoots capacity = " + this.shootsCapacity);
    }
    protected void fire(BasicHero enemy) {
        this.shootsCapacity = this.shootsCapacity - 1;
        enemy.setHealthLevel(enemy.getHealthLevel() - this.getBasicDamage());
        System.out.print(getType() + " " + getName() + " shoots to |" + enemy.getInfo() + "|. ");
        super.setState("Shot completed. This shooter is reloading");
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        if ((getHealthLevel() < 1) || shootsCapacity < 1) {
            return; // out from the method
        }
        BasicHero nearestEnemy = findNearestUnit(enemies);
        fire(nearestEnemy);
        for (BasicHero friend : friends) {
            if ((friend.getType().equals("Redneck")) && (friend.getHealthLevel() > 0) &&
                    (friend.getState() == "free")) { // Farmer/redneck fill in(заполняет, приносит) shoots
                friend.setState("busy");
                super.setState("ready");
                this.shootsCapacity++;
                System.out.println("His/Her shoots capacity = " + this.shootsCapacity);
                return;
            }

        }
        reArm();

    }
}
