import Heroes.BasicHero;
import Heroes.Infantry.Pikeman;
import Heroes.Infantry.Robber;
import Heroes.Farmer.Redneck;
import Heroes.Shooters.Archer;
import Heroes.Shooters.Crossbowman;
import Heroes.Wizard.Magus;
import Heroes.Wizard.Monk;
import Teams.TeamsManager;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        BasicHero kirill = new Monk("Kirill", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero gandalf = new Magus("Gandalf", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero solderJane = new Pikeman("Jane", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero robinGood = new Archer("Robin Good", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero johnD = new Robber("John D", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero sniper = new Crossbowman("Sniper", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero sadMan = new Redneck("Sad Name", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero legionary = new Pikeman("Legionary", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero bandit = new Robber("Bandit", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero pleb = new Redneck("Pleb", new Random().nextBoolean() ? 0:9, new Random().nextInt(50)); // Простолюдин/ Плебей
        BasicHero mifodiy = new Monk("Mifodiy", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero merlin = new Magus("Merlin", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero braveHeart = new Pikeman("Brave heart", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero artur = new Pikeman("Artur King", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero curva = new Robber("Curva", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero greenArrow = new Archer("Green arrow", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero solovey = new Robber("Solovey", new Random().nextBoolean() ? 0:9, new Random().nextInt(50)); // Nightingale
        BasicHero crossbowmanJr = new Crossbowman("Crossbowman jr", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero farmer = new Redneck("Farmer", new Random().nextBoolean() ? 0:9, new Random().nextInt(50));
        BasicHero neanderthal = new Redneck("Neanderthal", new Random().nextBoolean() ? 0:9, new Random().nextInt(50)); // Неандерталец

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



        System.out.println("Right team");
        rightTeam.forEach(n -> n.getInfo()); // итерация списка и вызов метода каждого наследника
        System.out.println("Left team");
        leftTeam.forEach(n -> n.getInfo());
//        System.out.println("Team of defectors");
//        teamOfDefectors.forEach(n -> n.getInfo());
        System.out.println("++".repeat(30));


        johnD.step(johnD.place.getX() == 9 ? leftTeam : rightTeam);
        neanderthal.step(neanderthal.place.getX() == 9 ? leftTeam : rightTeam);

        System.out.println("Analyzed all teams");
        System.out.println("Right team's enemies:");
        rightTeam.forEach(n -> n.step(leftTeam));

        System.out.println("Left team's enemies:");
        leftTeam.forEach(n -> n.step(rightTeam));
    }
}