package Heroes.Wizard;

import Heroes.BasicHero;

public abstract class Wizard extends BasicHero { // Волшебники
    static Integer localId = 100;
    public int healthRecover; // восстановление здоровья
    public Wizard(int healthLevel, String name, String type,
                  int basicDamage, int initiative) {
        super(healthLevel, name, type, basicDamage, initiative);
        this.healthRecover = basicDamage;
    }
    protected void setLocalId(){
        super.setId(localId++);
    }
    protected void cast(){}



}
