package Heroes;

public class Redneck extends BasicHero {
    static Integer localId = 400;

    public Redneck(String name) {
        super(15, name, "Redneck", 1, 2);
        super.setId(localId++);
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
        support();
    }

    protected void support() {
    }

}
