package safaryzone.controller.menu.evolution.service;

import safaryzone.pokemon.books.FinallyPokemonBooks;
import safaryzone.pokemon.books.NormalPokemonBooks;
import safaryzone.pokemon.books.RarePokemonBooks;
import safaryzone.pokemon.pokemon.Pokemon;
import safaryzone.user.Player;

import java.util.ArrayList;
import java.util.List;

public class EvolutionServiceLogic {
    private final int EVOLUTION_LEVEL = 10;
    private List<Pokemon> evolutionList;
    private List<String> names;


    public EvolutionServiceLogic() {
        this.evolutionList = new ArrayList<>();
        this.names = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        for (Pokemon playerPokemon : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            if (playerPokemon != null
                    && playerPokemon.getInformation().getLevel() == EVOLUTION_LEVEL
                    && !(playerPokemon instanceof FinallyPokemonBooks)) {
                this.evolutionList.add(playerPokemon);
                this.names.add(playerPokemon.getInformation().getName());
            }
        }
    }

    public String evolutionList() {
        StringBuilder list = new StringBuilder();

        for (Pokemon pokemon : evolutionList) {
            list.append(pokemon.getInformation().toString());
        }

        return list.toString();
    }

    public boolean checkEvolution() {
        if (this.evolutionList.size() == 0) return false;
        return true;
    }

    public void evolution(String pokemonName) {
        for (Pokemon pokemon : evolutionList) {
            if (pokemon.getInformation().getName().equals(pokemonName)) {
                int bookNumber = pokemon.getInformation().getBookNumber();

                if (pokemon instanceof NormalPokemonBooks) {
                    Player.getInstance().getPokemonList().evolution(bookNumber, RarePokemonBooks.values()[bookNumber - 1]);
                    return;
                }

                if (pokemon instanceof RarePokemonBooks) {
                    Player.getInstance().getPokemonList().evolution(bookNumber, FinallyPokemonBooks.values()[bookNumber - 1]);
                    return;
                }
            }
        }
    }

    public List<String> getNames() {
        return names;
    }
}


