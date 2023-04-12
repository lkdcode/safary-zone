package user;

import pokemon.PokemonList;

/**
 * 플레이어 클래스
 */
public class Player {
    private static Player instance;
    private final int START_LEVEL = 8;
    private PokemonList pokemonList;
    private Inventory inventory;
    private int level;
    private Garden garden;

    private Player() {
        this.inventory = new Inventory();
        this.garden = new Garden();
        this.pokemonList = new PokemonList();
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

    public PokemonList getPokemonList() {
        return pokemonList;
    }

}
