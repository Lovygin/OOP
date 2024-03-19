package org.example.Heroes.Shooters;

public class Archer extends Shooters { // Лучник
    public Archer(String name) {
        super(30, name, "Archer", 5, 8, 6, 4);
        super.setLocalId();
    }
}
