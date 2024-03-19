package Heroes.Shooters;

import Heroes.BasicHero;

public abstract class Shooters extends BasicHero { // Стрелок
    int shotLength; // Длина выстрела
    int capacity;
    static Integer localId = 300;
    public Shooters(int healthLevel, String name, String type, int basicDamage, int initiative,
                    int shotLength, int capacity) {
        super(healthLevel, name, type, basicDamage, initiative);
        this.shotLength = shotLength;
        this.capacity = capacity;
    }
    protected void setLocalId() {
        super.setId(localId++);
    }
    protected void reArm(){}
    protected void fire(){}

}
