package org.example.Heroes;

public class Redneck extends BasicHero{
    static Integer localId = 400;
    public Redneck(String name) {
        super(15, name, "Redneck", 1, 2);
        super.setId(localId++);
    }
}
