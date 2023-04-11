package User;

/**
 * 플레이어 클래스
 */
public class Player {
    private static Player instance;
    private Inventory inventory;
    private int level;
    private final int START_LEVEL = 1;

    private Player() {
        this.inventory = new Inventory();
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

    public int getLevel() {
        return level;
    }
}
