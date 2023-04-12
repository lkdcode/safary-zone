package pokemon.books;

import pokemon.PokemonInformation;
import pokemon.PokemonType;
import pokemon.pokemon.FinallyPokemon;

import static pokemon.PokemonType.*;
import static pokemon.PokemonType.ELECTRIC;

public enum FinallyPokemonBooks implements FinallyPokemon {
    EESANGHAEGGOT(1, "이상해꽃", GRASS, 1000, 1, 125, 248),
    RIZARMONG(2, "리자몽", FIRE, 1000, 1, 125, 248),
    GEOBUKWANG(3, "거북왕", WATER, 1000, 1, 125, 248),
    RAICHU(4, "라이츄", ELECTRIC, 1000, 1, 125, 248),
    LAFLESHI(5, "라플레시", GRASS, 1000, 1, 125, 248),
    BLAYBEOM(6, "블레이범", FIRE, 1000, 1, 125, 248),
    SUPERGOLDUCK(7, "슈퍼골덕", WATER, 1000, 1, 125, 248),
    DDAKGURI(8, "딱구리", ELECTRIC, 1000, 1, 125, 248),
    MEGANIUM(9, "메가니움", GRASS, 1000, 1, 125, 248),
    ELEVENTAIL(10, "일레븐테일", FIRE, 1000, 1, 125, 248),
    GANGCHANGI(11, "강챙이", WATER, 100, 1, 125, 248),
    UNIQUECOIL(12, "유니크코일", ELECTRIC, 10, 1, 125, 248),
    ;

    private PokemonInformation information;

    FinallyPokemonBooks(int bookNumber, String name, PokemonType type, int hp, int level, int damage, int skillDamage) {
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

    public PokemonInformation getInformation() {
        return information;
    }

}
