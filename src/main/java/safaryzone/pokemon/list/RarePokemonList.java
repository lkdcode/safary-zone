package safaryzone.pokemon.list;

import safaryzone.pokemon.books.RarePokemonBooks;
import safaryzone.pokemon.pokemon.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class RarePokemonList {
    private final Map<Integer, Pokemon> RARE_POKEMON_LIST;

    public RarePokemonList() {
        this.RARE_POKEMON_LIST = new HashMap<>();
        rarePokemonListInitialize();
    }

    private void rarePokemonListInitialize() {
        for (RarePokemonBooks rarePokemon : RarePokemonBooks.values()) {
            this.RARE_POKEMON_LIST.put(rarePokemon.getInformation().getBookNumber(), rarePokemon);
        }

    }
}
