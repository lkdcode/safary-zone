package etc.player;

/**
 * player single-tone
 */
public class Player {
    private static Player instance;
    private Inventory inventory;
    private int level;

    private Player() {
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }

        return instance;
    }

}
