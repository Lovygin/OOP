import Heroes.BasicHero;
import Heroes.Infantry.Pikeman;
import Heroes.Infantry.Robber;
import Heroes.Redneck;
import Heroes.Shooters.Archer;
import Heroes.Shooters.Crossbowman;
import Heroes.Wizard.Magus;
import Heroes.Wizard.Monk;
import Resources.Names;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int teamCapacity = 10;


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

        ArrayList<BasicHero> rightTeam = new ArrayList<>();

        rightTeam.add(kirill);
        rightTeam.add(gandalf);
        rightTeam.add(solderJane);
        rightTeam.add(robinGood);
        rightTeam.add(johnD);
        rightTeam.add(sniper);
        rightTeam.add(sadMan);
        rightTeam.add(legionary);
        rightTeam.add(bandit);
        rightTeam.add(pleb);
        rightTeam.add(merlin);
        rightTeam.add(mifodiy);
        rightTeam.add(braveHeart);
        rightTeam.add(artur);
        rightTeam.add(curva);
        rightTeam.add(greenArrow);
        rightTeam.add(crossbowmanJr);
        rightTeam.add(farmer);
        rightTeam.add(neanderthal);
        rightTeam.add(solovey);


        ArrayList<BasicHero> leftTeam = new ArrayList<>();
        ArrayList<BasicHero> greenTeam = new ArrayList<>(10);


        /**
         * Рандомное распределение уже существующих персонажей по командам.
         */
        while (leftTeam.size() < rightTeam.size()) {
            leftTeam.add(rightTeam.remove(new Random().nextInt(rightTeam.size())));
        }

        /**
         * Рандомное создание новых персонажей и добавление их в команду.
         * Используются рандомные имена из энумератора имен
         */
        for (int i = 0; i < teamCapacity; i++) {
            int selectionCondition = new Random().nextInt(7);
            switch (selectionCondition) {
                case (0):
                    greenTeam.add(new Pikeman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (1):
                    greenTeam.add(new Robber(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (2):
                    greenTeam.add(new Archer(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (3):
                    greenTeam.add(new Crossbowman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (4):
                    greenTeam.add(new Magus(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (5):
                    greenTeam.add(new Monk(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                default:
                    greenTeam.add(new Redneck(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
            }

        }


        System.out.println("Right team");
        rightTeam.forEach(n -> n.getInfo()); // итерация списка и вызов метода каждого наследника
        System.out.println("Left team");
        leftTeam.forEach(n -> n.getInfo());
        System.out.println("Green team");
        greenTeam.forEach(n -> n.getInfo());


    }
}