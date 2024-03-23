package heroes.Wizard;

public class Monk extends Wizards { // Монах


    public Monk(String name, int x, int y) {
        super(30, name, "Monk", 3, 3, x, y);
        super.setLocalId();
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Health recover = " + getBasicDamage() + "; " +
                "Initiative: " + getInitiative()+ "; " +
                "Position: " + super.place.getX() + ":" + super.place.getY();
    }


    @Override
    protected void cast() {
        super.cast();
    }
}
