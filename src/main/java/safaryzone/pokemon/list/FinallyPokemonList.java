package safaryzone.pokemon.list;

import safaryzone.pokemon.books.FinallyPokemonBooks;
import safaryzone.pokemon.pokemon.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class FinallyPokemonList {
    private final Map<Integer, Pokemon> FINALLY_POKEMON_LIST;

    public FinallyPokemonList() {
        this.FINALLY_POKEMON_LIST = new HashMap<>();
        finallyPokemonLIstInitialize();
    }

    private void finallyPokemonLIstInitialize() {
        for (FinallyPokemonBooks finallyPokemon : FinallyPokemonBooks.values()) {
            this.FINALLY_POKEMON_LIST.put(finallyPokemon.getInformation().getBookNumber(), finallyPokemon);
        }
    }

    public Map<Integer, Pokemon> getFINALLY_POKEMON_LIST() {
        return FINALLY_POKEMON_LIST;
    }
}
