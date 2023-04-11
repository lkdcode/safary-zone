package etc.pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonList {
    private List<Pokemon> pokemonList;

    public PokemonList() {
        this.pokemonList = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        for (PokemonBooks pokemon : PokemonBooks.values()) {
            this.pokemonList.add(PokemonFactory.createPokemon(pokemon));
        }
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
}
