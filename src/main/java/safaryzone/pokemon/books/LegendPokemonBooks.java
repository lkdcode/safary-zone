package safaryzone.pokemon.books;

import safaryzone.pokemon.PokemonInformation;
import safaryzone.pokemon.PokemonType;
import safaryzone.pokemon.pokemon.LegendPokemon;

public enum LegendPokemonBooks implements LegendPokemon {
    FREEZER(101, "프리져", PokemonType.WATER, 3000, 1, 265, 420),
    MOLTRES(102, "파이어", PokemonType.FIRE, 3000, 1, 265, 420),
    THUNDER(103, "썬더", PokemonType.ELECTRIC, 3000, 1, 265, 420),
    MEWTWO(104, "뮤츠", PokemonType.NORMAL, 3000, 1, 265, 420),
    ;

    private PokemonInformation information;

    LegendPokemonBooks(int bookNumber, String name, PokemonType type, int hp, int level, int damage, int skillDamage) {
        this.information = new PokemonInformation.Builder()
                .bookNumber(bookNumber)
                .name(name)
                .type(type)
                .hp(hp)
                .level(level)
                .damage(damage)
                .skillDamage(skillDamage)
                .build();
    }

    @Override
    public PokemonInformation getInformation() {
        return information;
    }
}
