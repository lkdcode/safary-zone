package etc.player;

import etc.garden.Garden;

/**
 * player single-tone
 */
public class Player {
    private static Player instance;
    private Inventory inventory;
    private Garden garden;
    private int level;

    private Player() {
        this.inventory = new Inventory();
        this.garden = new Garden();
        this.level = 1;
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
