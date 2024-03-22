package Interfaces;

import Heroes.BasicHero;

import java.util.ArrayList;

public interface InGameInterface {
    void step(ArrayList<BasicHero> enemies);
    String getInfo();

}
