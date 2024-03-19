import Heroes.BasicHero;
import Heroes.Infantry.Pikeman;
import Heroes.Infantry.Robber;
import Heroes.Redneck;
import Heroes.Shooters.Archer;
import Heroes.Shooters.Crossbowman;
import Heroes.Wizard.Magus;
import Heroes.Wizard.Monk;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        BasicHero kirill = new Monk("Kirill");
        BasicHero gandalf = new Magus("Gandalf");
        BasicHero solderJane = new Pikeman("Jane");
        BasicHero robinGood = new Archer("Robin Good");
        BasicHero johnD = new Robber("John D");
        BasicHero sniper = new Crossbowman("Sniper");
        BasicHero sadMan = new Redneck("Sad Name");
        BasicHero legionary = new Pikeman("Legionary");
        BasicHero bandit = new Robber("Bandit");
        BasicHero pleb = new Redneck("Pleb"); // Простолюдин/ Плебей

        ArrayList<BasicHero> right = new ArrayList<>();
        right.add(kirill);
        right.add(gandalf);
        right.add(solderJane);
        right.add(robinGood);
        right.add(johnD);
        right.add(sniper);
        right.add(sadMan);
        right.add(legionary);
        right.add(bandit);
        right.add(pleb);


        BasicHero mifodiy = new Monk("Mifodiy");
        BasicHero merlin = new Magus("Merlin");
        BasicHero braveHeart = new Pikeman("Brave heart");
        BasicHero artur = new Pikeman("Artur King");
        BasicHero curva = new Robber("Curva");
        BasicHero greenArrow = new Archer("Green arrow");
        BasicHero solovey = new Robber("Solovey"); // Nightingale
        BasicHero crossbowmanJr = new Crossbowman("Crossbowman jr");
        BasicHero farmer = new Redneck("Farmer");
        BasicHero neanderthal = new Redneck("Neanderthal"); // Неандерталец


        ArrayList<BasicHero> left = new ArrayList<>();
        left.add(mifodiy);
        left.add(merlin);
        left.add(braveHeart);
        left.add(artur);
        left.add(curva);
        left.add(greenArrow);
        left.add(crossbowmanJr);
        left.add(farmer);
        left.add(neanderthal);
        left.add(solovey);

        right.forEach(n -> n.getInfo()); // итерация списка и вызов метода каждого наследника
        System.out.println("==".repeat(20));
        left.forEach(n -> n.getInfo());






    }
}