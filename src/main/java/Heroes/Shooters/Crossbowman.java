package Heroes.Shooters;

public class Crossbowman extends Shooters { // Арбалетчик
    public Crossbowman(String name) {
        super(30, name, "Crossbowman", 5, 8, 6, 4);
        super.setLocalId();
    }
    @Override
    public String getInfo() {
        System.out.println("Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Health recover = " + getBasicDamage() + "; " +
                "Initiative: " + getInitiative());
        return String.valueOf(this.getClass());
    }

    @Override
    public void step() {
        reArm();
        fire();
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
