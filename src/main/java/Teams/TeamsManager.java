package Teams;

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

public class TeamsManager {
    protected ArrayList<BasicHero> rightTeam = new ArrayList<>();
    protected ArrayList<BasicHero> leftTeam = new ArrayList<>();
    protected ArrayList<BasicHero> teamOfDefectors = new ArrayList<>();

    protected int teamCapacity;


    public TeamsManager(ArrayList<BasicHero> rightTeam, ArrayList<BasicHero> leftTeam, ArrayList<BasicHero> teamOfDefectors) {
        this.rightTeam = rightTeam;
        this.leftTeam = leftTeam;
        this.teamOfDefectors = teamOfDefectors;
    }

    public TeamsManager() {
    }

    public int getTeamCapacity() {
        return teamCapacity;
    }

    public void setTeamCapacity(int commandCapacity) {
        this.teamCapacity = commandCapacity;
    }

    public ArrayList<BasicHero> getRightTeam() {
        return rightTeam;
    }

    public ArrayList<BasicHero> getLeftTeam() {
        return leftTeam;
    }

    public ArrayList<BasicHero> getTeamOfDefectors() {
        return teamOfDefectors;
    }
    /**
     * leftTeam может включать в себя следующих персонажей:
     * * Robber
     * * Archer
     * * Magus
     * * Redneck
     */
    public ArrayList<BasicHero> leftTeamFilling(){
        for (int i = 0; i < teamCapacity; i++) {
            int selectionCondition = new Random().nextInt(4);
            switch (selectionCondition) {
                case (0):
                    leftTeam.add(new Robber(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (1):
                    leftTeam.add(new Archer(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (2):
                    leftTeam.add(new Magus(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                default:
                    leftTeam.add(new Redneck(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
            }
        }
        return leftTeam;
    }
    /**
     * rightTeam может включать в себя следующих персонажей:
     * * Pikeman
     * * Crossbowman
     * * Monk
     * * Redneck
     */
    public ArrayList<BasicHero> rightTeamFilling(){
        for (int i = 0; i < teamCapacity; i++) {
            int selectionCondition = new Random().nextInt(4); //bound - 1
            switch (selectionCondition) {
                case (0):
                    rightTeam.add(new Pikeman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (1):
                    rightTeam.add(new Crossbowman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (2):
                    rightTeam.add(new Monk(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                default:
                    rightTeam.add(new Redneck(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
            }
        }
        return rightTeam;
    }

    /**
     * teamOfDefectors может включать в себя персонажей всех типов.
     */
    public ArrayList<BasicHero> teamOfDefectorsFilling() {
        for (int i = 0; i < teamCapacity; i++) {
            int selectionCondition = new Random().nextInt(7);
            switch (selectionCondition) {
                case (0):
                    teamOfDefectors.add(new Pikeman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (1):
                    teamOfDefectors.add(new Robber(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (2):
                    teamOfDefectors.add(new Archer(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (3):
                    teamOfDefectors.add(new Crossbowman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (4):
                    teamOfDefectors.add(new Magus(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                case (5):
                    teamOfDefectors.add(new Monk(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
                    break;
                default:
                    teamOfDefectors.add(new Redneck(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)])));
            }

        }
        return teamOfDefectors;
    }

    /**
     * Рандомное распределение уже существующих персонажей по командам.
     * @param listOfUnits список созданных вручную персонажей
     * @return массив содержащий списки 2-х рандомных команд.
     */
    public ArrayList<BasicHero> teamSelection(ArrayList<BasicHero> listOfUnits){  //Распределение по командам
        ArrayList<BasicHero>[] teams = new ArrayList[2];
        teams[1] = listOfUnits;
        teams[0] = new ArrayList<>();
        while (teams[0].size() < teams[1].size()) {
            teams[0].add(teams[1].remove(new Random().nextInt(teams[1].size())));
        }
        return teams[new Random().nextInt(teams.length)];
    }




}
