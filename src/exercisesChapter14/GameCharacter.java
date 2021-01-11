package exercisesChapter14;

public class GameCharacter {
    private final int power;
    private final String type;
    private final String[] weapons;

    public GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapons = w;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponList = "";
        for (int i = 0; i < weapons.length; i++) {
            weaponList += weapons[i] + " ";
        }
        return weaponList;
    }
}



