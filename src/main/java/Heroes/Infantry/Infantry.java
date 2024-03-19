package Heroes.Infantry;

import Heroes.BasicHero;

public abstract class Infantry extends BasicHero { // Пехота
    static Integer localId = 200;

    public Infantry(int healthLevel, String name, String type, int basicDamage, int initiative) {
        super(healthLevel, name, type, basicDamage, initiative);
        super.setId(localId++);

    }
    protected void setLocalId(){
        super.setId(localId++);
    }

    protected void attack(){}
    protected void protection(){}
}
