package Heroes.Infantry;

public class Robber extends Infantry { // Разбойник/Грабитель
    public Robber(String name) {
        super(30, name, "Robber", 2, 3);
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
        attack();
        protection();
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
