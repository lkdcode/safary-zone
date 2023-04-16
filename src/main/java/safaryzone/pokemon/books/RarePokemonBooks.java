package safaryzone.pokemon.books;

import safaryzone.pokemon.PokemonInformation;
import safaryzone.pokemon.PokemonType;
import safaryzone.pokemon.pokemon.RarePokemon;

public enum RarePokemonBooks implements RarePokemon {
    EESANGHAEPOOL(1, "이상해풀", PokemonType.GRASS, 100, 1, 25, 48),
    RIZARD(2, "리자드", PokemonType.FIRE, 100, 1, 25, 48),
    EONIBUGI(3, "어니부기", PokemonType.WATER, 100, 1, 25, 48),
    PICHACHU(4, "피카츄", PokemonType.ELECTRIC, 100, 1, 25, 48),
    NAEMSAEGGO(5, "냄새꼬", PokemonType.GRASS, 100, 1, 25, 48),
    MAGCANE(6, "마그케인", PokemonType.FIRE, 100, 1, 25, 48),
    GOLDUCK(7, "골덕", PokemonType.WATER, 100, 1, 25, 48),
    DEGURI(8, "데구리", PokemonType.ELECTRIC, 100, 1, 25, 48),
    BAYLEAF(9, "베이리프", PokemonType.GRASS, 100, 1, 25, 48),
    NINETAIL(10, "나인테일", PokemonType.FIRE, 100, 1, 25, 48),
    SOORYUKCHANGI(11, "수륙챙이", PokemonType.WATER, 100, 1, 25, 48),
    RARECOIL(12, "레어코일", PokemonType.ELECTRIC, 100, 1, 25, 48),
    ;
    private PokemonInformation information;

    RarePokemonBooks(int bookNumber, String name, PokemonType type, int hp, int level, int damage, int skillDamage) {
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