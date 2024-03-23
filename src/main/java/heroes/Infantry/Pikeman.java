package heroes.Infantry;

public class Pikeman extends Infantries { // Копейщик
    public Pikeman(String name, int x, int y) {
        super(30, name, "Pikeman", 2, 5, x, y);
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
    protected void attack() {
        super.attack();
    }

    @Override
    protected void protection() {
        super.protection();
    }
}
