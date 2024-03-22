package Heroes.Shooters;

import Heroes.BasicHero;

import java.util.ArrayList;

public class Archer extends Shooters { // Лучник
    public Archer(String name, int x, int y) {
        super(30, name, "Archer", 5, 8, 6, 4, x, y);
        super.setLocalId();
    }


    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Health recover = " + getBasicDamage() + "; " +
                "Initiative: " + getInitiative()+ "; " +
                "Position: " + super.getPlace().getX() + ":" + super.getPlace().getY();
    }

//    @Override
//    public void step(ArrayList<BasicHero> enemies) {
//        super.step(enemies);
//    }

    @Override
    public void reArm() {
        super.reArm();
    }

    @Override
    public void fire() {
        super.fire();
    }
}
