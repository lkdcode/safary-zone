package etc.pokemon;

public class PokemonFactory {

    private PokemonFactory() {
    }

    public static Pokemon createPokemon(PokemonBooks pokemon) {
        return new PokemonInformation.Builder()
                .name(pokemon)
                .hp(pokemon.getHp())
                .level(pokemon.getLevel())
                .build();
    }

}