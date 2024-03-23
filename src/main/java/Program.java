import heroes.BasicHero;
import heroes.Infantry.Pikeman;
import heroes.Infantry.Robber;
import heroes.Farmer.Redneck;
import heroes.Shooters.Archer;
import heroes.Shooters.Crossbowman;
import heroes.Wizard.Magus;
import heroes.Wizard.Monk;
import teams.TeamsManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        BasicHero kirill = new Monk("Kirill", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero gandalf = new Magus("Gandalf", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero solderJane = new Pikeman("Jane", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero robinGood = new Archer("Robin Good", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero johnD = new Robber("John D", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero sniper = new Crossbowman("Sniper", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero sadMan = new Redneck("Sad Name", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero legionary = new Pikeman("Legionary", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero bandit = new Robber("Bandit", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero pleb = new Redneck("Pleb", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50)); // Простолюдин/ Плебей
        BasicHero mifodiy = new Monk("Mifodiy", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero merlin = new Magus("Merlin", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero braveHeart = new Pikeman("Brave heart", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero artur = new Pikeman("Artur King", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero curva = new Robber("Curva", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero greenArrow = new Archer("Green arrow", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero solovey = new Robber("Solovey", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50)); // Nightingale
        BasicHero crossbowmanJr = new Crossbowman("Crossbowman jr", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero farmer = new Redneck("Farmer", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50));
        BasicHero neanderthal = new Redneck("Neanderthal", new Random().nextBoolean() ? 0 : 9, new Random().nextInt(50)); // Неандерталец

//        ArrayList<BasicHero> startTeam = new ArrayList<>();
//
//        startTeam.add(kirill);
//        startTeam.add(gandalf);
//        startTeam.add(solderJane);
//        startTeam.add(robinGood);
//        startTeam.add(johnD);
//        startTeam.add(sniper);
//        startTeam.add(sadMan);
//        startTeam.add(legionary);
//        startTeam.add(bandit);
//        startTeam.add(pleb);
//        startTeam.add(merlin);
//        startTeam.add(mifodiy);
//        startTeam.add(braveHeart);
//        startTeam.add(artur);
//        startTeam.add(curva);
//        startTeam.add(greenArrow);
//        startTeam.add(crossbowmanJr);
//        startTeam.add(farmer);
//        startTeam.add(neanderthal);
//        startTeam.add(solovey);

        TeamsManager teamsManager = new TeamsManager();
        teamsManager.setTeamCapacity(10);

//        ArrayList<BasicHero> teamOfDefectors = teamsManager.teamOfDefectorsFilling(true);
//        //ArrayList<BasicHero> teamOfDefectors = teamsManager.creatingTwoTeamsFromListOfUnits(startTeam)[1]; // команда перебежчиков


        ArrayList<BasicHero> leftTeam = teamsManager.leftTeamFilling();
        ArrayList<BasicHero> rightTeam = teamsManager.rightTeamFilling();

        ArrayList<BasicHero> unitedTeam = new ArrayList<>();
        unitedTeam.addAll(leftTeam);
        unitedTeam.addAll(rightTeam);

        //unitedTeam.sort(Comparator.comparingInt(BasicHero::getInitiative));
        //unitedTeam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative()); // lambda func comparator
        /**
         * Переопределяем компаратор по инициативе хода.
         */
        unitedTeam.sort(new Comparator<BasicHero>() {
            @Override
            public int compare(BasicHero o1, BasicHero o2) {
                int result = o2.getInitiative() - o1.getInitiative();
                if (result != 0) return result;
                return o2.getHealthLevel() - o1.getHealthLevel();
            }
        });


        System.out.println("Right team");
        rightTeam.forEach(n -> System.out.println(n.getInfo())); // итерация списка и вызов метода каждого наследника
        System.out.println("Left team");
        leftTeam.forEach(n -> System.out.println(n.getInfo()));


        System.out.println("++".repeat(30));


        System.out.println("Steps all units: ");
        for (
                BasicHero item : unitedTeam) {
            if (leftTeam.contains(item)) {
                item.step(rightTeam, leftTeam);
            } else {
                item.step(leftTeam, rightTeam);
            }
            System.out.println(item.getName() + "-" + item.getInitiative() + "(" + item.getId() + ")");
        }

    }
}