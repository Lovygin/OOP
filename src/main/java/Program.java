import Heroes.BasicHero;
import Heroes.Infantry.Pikeman;
import Heroes.Infantry.Robber;
import Heroes.Redneck;
import Heroes.Shooters.Archer;
import Heroes.Shooters.Crossbowman;
import Heroes.Wizard.Magus;
import Heroes.Wizard.Monk;
import Teams.TeamsManager;

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

        ArrayList<BasicHero> startTeam = new ArrayList<>();

        startTeam.add(kirill);
        startTeam.add(gandalf);
        startTeam.add(solderJane);
        startTeam.add(robinGood);
        startTeam.add(johnD);
        startTeam.add(sniper);
        startTeam.add(sadMan);
        startTeam.add(legionary);
        startTeam.add(bandit);
        startTeam.add(pleb);
        startTeam.add(merlin);
        startTeam.add(mifodiy);
        startTeam.add(braveHeart);
        startTeam.add(artur);
        startTeam.add(curva);
        startTeam.add(greenArrow);
        startTeam.add(crossbowmanJr);
        startTeam.add(farmer);
        startTeam.add(neanderthal);
        startTeam.add(solovey);

        TeamsManager teamsManager = new TeamsManager();
        teamsManager.setTeamCapacity(10);

        ArrayList<BasicHero> leftTeam = teamsManager.leftTeamFilling();
        ArrayList<BasicHero> rightTeam = teamsManager.rightTeamFilling();


        ArrayList<BasicHero> teamOfDefectors = teamsManager.teamSelection(startTeam); // команда перебежчиков


        System.out.println("Right team");
        rightTeam.forEach(n -> n.getInfo()); // итерация списка и вызов метода каждого наследника
        System.out.println("Left team");
        leftTeam.forEach(n -> n.getInfo());
        System.out.println("Team of defectors");
        teamOfDefectors.forEach(n -> n.getInfo());

    }

}