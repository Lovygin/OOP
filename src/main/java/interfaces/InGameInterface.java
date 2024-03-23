package interfaces;

import heroes.BasicHero;

import java.util.ArrayList;

public interface InGameInterface {
    void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends);
    String getInfo();

}
