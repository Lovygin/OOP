package Heroes.Wizard;

import Heroes.BasicHero;

import java.util.ArrayList;

public class Monk extends Wizards { // Монах


    public Monk(String name, int x, int y) {
        super(50, name, "Monk", 3, 4, x, y);
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


    @Override
    protected void cast() {
        super.cast();
    }
}
