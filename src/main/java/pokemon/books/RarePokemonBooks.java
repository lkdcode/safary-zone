package pokemon.books;

import pokemon.PokemonInformation;
import pokemon.PokemonType;
import pokemon.pokemon.RarePokemon;

import static pokemon.PokemonType.*;

public enum RarePokemonBooks implements RarePokemon {
    EESANGHAEPOOL(1, "이상해풀", GRASS, 100, 1, 25, 48),
    RIZARD(2, "리자드", FIRE, 100, 1, 25, 48),
    EONIBUGI(3, "어니부기", WATER, 100, 1, 25, 48),
    PICHACHU(4, "피카츄", ELECTRIC, 100, 1, 25, 48),
    NAEMSAEGGO(5, "냄새꼬", GRASS, 100, 1, 25, 48),
    MAGCANE(6, "마그케인", FIRE, 100, 1, 25, 48),
    GOLDUCK(7, "골덕", WATER, 100, 1, 25, 48),
    DEGURI(8, "꼬마돌", ELECTRIC, 100, 1, 25, 48),
    BAYLEAF(9, "베이리프", GRASS, 100, 1, 25, 48),
    NINETAIL(10, "나인테일", FIRE, 100, 1, 25, 48),
    SOORYUKCHANGI(11, "수륙챙이", WATER, 10, 1, 25, 48),
    RARECOIL(12, "레어코일", ELECTRIC, 10, 1, 25, 48),
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