package Heroes.Infantry;

import Heroes.BasicHero;

import java.util.ArrayList;

public class Robber extends Infantries { // Разбойник/Грабитель
    public Robber(String name, int x, int y) {
        super(30, name, "Robber", 2, 3, x, y);
        super.setLocalId();
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Health recover = " + getBasicDamage() + "; " +
                "Initiative: " + getInitiative() + "; " +
                "Position: " + super.getPlace().getX() + ":" + super.getPlace().getY();
    }

//    @Override
//    public void step(ArrayList<BasicHero> enemies) {
//        super.step(enemies);
//    }

    @Override
    protected void attack() {
        super.attack();
    }

    @Override
    protected void protection() {
        super.protection();
    }

}
