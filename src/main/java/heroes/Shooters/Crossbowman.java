package heroes.Shooters;

public class Crossbowman extends Shooters { // Арбалетчик
    public Crossbowman(String name, int x, int y) {
        super(30, name, "Crossbowman", 5, 6, 6, 8, x, y);
        super.setLocalId();
    }
    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Health recover = " + getBasicDamage() + "; " +
                "Shoots capacity = " + shootsCapacity + "; " +
                "Initiative: " + getInitiative()+ "; " +
                "Position: " + super.place.getX() + ":" + super.place.getY();
    }


    @Override
    public void reArm() {
        super.reArm();
    }

    @Override
    public void fire() {
        super.fire();
    }
}
