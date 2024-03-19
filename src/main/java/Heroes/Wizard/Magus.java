package Heroes.Wizard;

public class Magus extends Wizard { // Маг
    public Magus (String name) {
        super(50, name, "Magus", 3, 4);
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
        cast();
    }

    @Override
    protected void cast() {
        super.cast();
    }
}
