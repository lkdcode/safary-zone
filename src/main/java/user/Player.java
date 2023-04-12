package user;


/**
 * 플레이어 클래스
 */
public class Player {
    private static Player instance;
    private Inventory inventory;
    private int level;
    private Garden garden;
    private final int START_LEVEL = 1;

    private Player() {
        this.inventory = new Inventory();
        this.garden = new Garden();
        this.level = START_LEVEL;
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Garden getGarden() {
        return garden;
    }

    public int getLevel() {
        return level;
    }
}
