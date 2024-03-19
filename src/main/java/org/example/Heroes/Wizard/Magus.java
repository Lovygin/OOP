package org.example.Heroes.Wizard;

public class Magus extends Wizard { // Маг
    public Magus (String name) {
        super(50, name, "Magus", 3, 4);
        super.setLocalId();
    }
}
