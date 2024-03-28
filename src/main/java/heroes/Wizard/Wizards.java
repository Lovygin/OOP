package heroes.Wizard;

import heroes.BasicHero;

import java.util.*;

public abstract class Wizards extends BasicHero { // Волшебники
    static Integer localId = 100;
    public int healthRecover; // восстановление здоровья

    public Wizards(int healthLevel, String name, String type,
                   int basicDamage, int initiative, int x, int y) {
        super(healthLevel, name, type, basicDamage, initiative, x, y);
        super.setState("ready");
        this.healthRecover = basicDamage;
    }

    protected void setLocalId() {
        super.setId(localId++);
    }

    protected void cast() {
    }

    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> friends) {
        ArrayList<BasicHero> friendsTookDamage = new ArrayList<>();
        friendsTookDamage.add(this);
        System.out.println(this.getInfo());
        while (super.getState().equals("ready")) {
            int minHealthLevel = 30;
            BasicHero friendWithMinHP = this;
            for (int i = 0; i < friends.size(); i++) {
                if (friends.get(i).getHealthLevel() < minHealthLevel) {
                    minHealthLevel = friends.get(i).getHealthLevel();
                    friendWithMinHP = friends.get(i);
                }
                if (friends.get(i).getHealthLevel() < 30) { //заменить на переменную maxHealthLevel у каждого абстрактного героя
                    friendsTookDamage.add(friends.get(i));
                }
            }
            while (!super.getState().equals("busy")) {
                System.out.println("Which hero to tread?");
                System.out.println("1 -The hero with a min health level: " + friendWithMinHP.getType() + " "
                        + "HP = " + friendWithMinHP.getHealthLevel());
                System.out.println("2 -A random hero with a not full health level. Maybe the wizard himself.");
                System.out.println("Enter the number of a command: ");
                int answer = new Scanner(System.in).nextInt();
                if (answer == 1) {
                    friendWithMinHP.setHealthLevel(Math.min
                            (friendWithMinHP.getHealthLevel() + this.healthRecover, 30)); //вернет минимальное между этими 2-мя числами
                    System.out.println(this.getType() + " " + this.name + " healed -> " + friendWithMinHP.getInfo());
                    super.setState("busy");
                } else if (answer == 2) {
                    int index = new Random().nextInt(friendsTookDamage.size());
                    friendsTookDamage.get(index).setHealthLevel(Math.min
                            (friendsTookDamage.get(index).getHealthLevel() + this.healthRecover, 30));
                    System.out.println(this.getType() + " " + this.name + " healed -> " + friendsTookDamage.get(index).getInfo());
                    super.setState("busy");
                } else {
                    System.out.println("Try to enter it again (1 or 2)");
                }
            }


        }

    }
}
