package org.example.Heroes.Shooters;

import org.example.Heroes.BasicHero;

public abstract class Shooters extends BasicHero { // Стрелок
    int shotLength; // Длина выстрела
    int capacity;
    public Shooters(int id, int healthLevel, String name, String type, int basicDamage, int initiative,
                    int shotLength, int capacity) {
        super(id, healthLevel, name, type, basicDamage, initiative);
        this.shotLength = shotLength;
        this.capacity = capacity;
    }
}
