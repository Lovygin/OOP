package heroes.Shooters;

public class Archer extends Shooters { // Лучник
    public Archer(String name, int x, int y) {
        super(30, name, "Archer", 5, 7, 6, 10, x, y);
        super.setLocalId();
    }


    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Health recover = " + getBasicDamage() + "; " +
                "Shoots capacity = " + shootsCapacity + "; " +
                "Initiative: " + getInitiative() + "; " +
                "Position: " + super.place.getX() + ":" + super.place.getY();
    }
}