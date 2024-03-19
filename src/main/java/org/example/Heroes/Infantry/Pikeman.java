package org.example.Heroes.Infantry;

public class Pikeman extends Infantry { // Копейщик
    public Pikeman(String name) {
        super(30, name, "Pikeman", 2, 3);
        super.setLocalId();
    }
}
