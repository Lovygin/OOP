package Heroes.Wizard;

import Heroes.BasicHero;

import java.util.ArrayList;

public class Magus extends Wizards { // Маг
    public Magus (String name, int x, int y) {
        super(50, name, "Magus", 3, 4, x, y);
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
    protected void cast() {
        super.cast();
    }
}
