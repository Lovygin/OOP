package heroes.Infantry;

public class Robber extends Infantries { // Разбойник/Грабитель
    public Robber(String name, int x, int y) {
        super(30, name, "Robber", 2, 5, x, y);
        super.setLocalId();
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; " +
                "Name: " + this.getName() + "; " +
                "Health level = " + getHealthLevel() + "; " +
                "Health recover = " + getBasicDamage() + "; " +
                "Initiative: " + getInitiative() + "; " +
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
