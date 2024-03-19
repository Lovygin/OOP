package org.example.Heroes.Infantry;

public class Robber extends Infantry { // Разбойник/Грабитель
    public Robber(String name) {
        super(30, name, "Robber", 2, 3);
        super.setLocalId();
    }
}
