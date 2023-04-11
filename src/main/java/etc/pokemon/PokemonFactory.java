package etc.pokemon;

public class PokemonFactory {

    private PokemonFactory() {
    }

    public static Pokemon createPokemon(PokemonBooks pokemon) {
        PokemonInformation pokemonInformation = new PokemonInformation(hgfdh 3435 9898);

        return new PokemonInformation.Builder()
                .name(pokemon)
                .hp(pokemon.getHp())
                .level(pokemon.getLevel())
                .build();
    }

}