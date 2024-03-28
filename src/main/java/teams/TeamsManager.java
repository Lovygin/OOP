package teams;

import heroes.BasicHero;
import heroes.Infantry.Pikeman;
import heroes.Infantry.Robber;
import heroes.Farmer.Redneck;
import heroes.Shooters.Archer;
import heroes.Shooters.Crossbowman;
import heroes.Wizard.Magus;
import heroes.Wizard.Monk;
import resources.Names;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class TeamsManager {
    protected ArrayList<BasicHero> rightTeam = new ArrayList<>();
    protected ArrayList<BasicHero> leftTeam = new ArrayList<>();
    protected ArrayList<BasicHero> teamOfDefectors = new ArrayList<>();
    protected ArrayList<BasicHero> unitedTeam = new ArrayList<>();
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

    public ArrayList<BasicHero> getUnitedTeam() {
        this.unitedTeam.addAll(this.leftTeam);
        this.unitedTeam.addAll(this.rightTeam);
        return unitedTeam;
    }

    /**
     * Метод формирующий leftTeam из рандомных персонажей
     * leftTeam может включать в себя следующих персонажей:
     * * Robber
     * * Archer
     * * Magus
     * * Redneck
     */
    public ArrayList<BasicHero> leftTeamFilling() {
        for (int i = 0; i < teamCapacity; i++) {
            int selectionCondition = new Random().nextInt(4);
            switch (selectionCondition) {
                case (0):
                    leftTeam.add(new Robber(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]), 0, new Random().nextInt(50)));
                    break;
                case (1):
                    leftTeam.add(new Archer(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]), 0, new Random().nextInt(50)));
                    break;
                case (2):
                    leftTeam.add(new Magus(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]), 0, new Random().nextInt(50)));
                    break;
                default:
                    leftTeam.add(new Redneck(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]), 0, new Random().nextInt(50)));
            }
        }
        return leftTeam;
    }

    /**
     * Метод формирующий rightTeam из рандомных персонажей
     * rightTeam может включать в себя следующих персонажей:
     * * Pikeman
     * * Crossbowman
     * * Monk
     * * Redneck
     */
    public ArrayList<BasicHero> rightTeamFilling() {
        for (int i = 0; i < teamCapacity; i++) {
            int selectionCondition = new Random().nextInt(4); //bound - 1
            switch (selectionCondition) {
                case (0):
                    rightTeam.add(new Pikeman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            9, new Random().nextInt(50)));
                    break;
                case (1):
                    rightTeam.add(new Crossbowman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            9, new Random().nextInt(50)));
                    break;
                case (2):
                    rightTeam.add(new Monk(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            9, new Random().nextInt(50)));
                    break;
                default:
                    rightTeam.add(new Redneck(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            9, new Random().nextInt(50)));
            }
        }
        return rightTeam;
    }

    /**
     * Метод формирующий teamOfDefectors из рандомных персонажей.
     * teamOfDefectors может включать в себя персонажей всех типов.
     *
     * @param isCreatedLeftTeam если левая команда создана, то создается правая
     */
    public ArrayList<BasicHero> teamOfDefectorsFilling(boolean isCreatedLeftTeam) {
        for (int i = 0; i < teamCapacity; i++) {
            int selectionCondition = new Random().nextInt(7);
            int x = isCreatedLeftTeam ? 9 : 0;
            switch (selectionCondition) {
                case (0):
                    teamOfDefectors.add(new Pikeman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            x, new Random().nextInt(50)));
                    break;
                case (1):
                    teamOfDefectors.add(new Robber(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            x, new Random().nextInt(50)));
                    break;
                case (2):
                    teamOfDefectors.add(new Archer(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            x, new Random().nextInt(50)));
                    break;
                case (3):
                    teamOfDefectors.add(new Crossbowman(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            x, new Random().nextInt(50)));
                    break;
                case (4):
                    teamOfDefectors.add(new Magus(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            x, new Random().nextInt(50)));
                    break;
                case (5):
                    teamOfDefectors.add(new Monk(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            x, new Random().nextInt(50)));
                    break;
                default:
                    teamOfDefectors.add(new Redneck(String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]),
                            x, new Random().nextInt(50)));
            }
        }
        return teamOfDefectors;
    }

    /**
     * Рандомное распределение уже существующих персонажей по командам.
     *
     * @param listOfUnits список созданных вручную персонажей
     * @return массив содержащий списки 2-х рандомных команд.
     */

    public ArrayList<BasicHero>[] creatingTwoTeamsFromListOfUnits(ArrayList<BasicHero> listOfUnits) {  //Распределение по командам
        ArrayList<BasicHero>[] teams = new ArrayList[2];
        teams[1] = listOfUnits;
        teams[0] = new ArrayList<>();
        while (teams[0].size() < teams[1].size()) {
            teams[0].add(teams[1].remove(new Random().nextInt(teams[1].size())));
        }
        teams[0].forEach(n -> n.getPlace().setX(0));
        teams[1].forEach(n -> n.getPlace().setX(9));
        return teams;
    }

    /**
     * Переопределяем компаратор по инициативе хода и
     * по уровню здоровья, в случае если одинаковой уровень инициативы
     */
    private final Comparator<BasicHero> compareByInitiativeAndHP = new Comparator<BasicHero>() {
        @Override
        public int compare(BasicHero o1, BasicHero o2) {
            int res = o2.getInitiative() - o1.getHealthLevel();
            if (res != 0) return res;
            else return o2.getHealthLevel() - o1.getHealthLevel();
        }
    };

    public ArrayList<BasicHero> sortTeamByInitiativeAndHealthLevel() {
        this.unitedTeam.sort(compareByInitiativeAndHP);
        return this.unitedTeam;
    }

    public ArrayList<BasicHero> sortTeamByInitiativeAndHealthLevel(ArrayList<BasicHero> unitedTeam) {
        unitedTeam.sort(compareByInitiativeAndHP);
        return unitedTeam;
    }
}