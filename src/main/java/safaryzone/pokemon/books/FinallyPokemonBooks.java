package safaryzone.pokemon.books;

import safaryzone.pokemon.PokemonInformation;
import safaryzone.pokemon.PokemonType;
import safaryzone.pokemon.pokemon.FinallyPokemon;

public enum FinallyPokemonBooks implements FinallyPokemon {
    EESANGHAEGGOT(1, "이상해꽃", PokemonType.GRASS, 1000, 1, 125, 248),
    RIZARMONG(2, "리자몽", PokemonType.FIRE, 1000, 1, 125, 248),
    GEOBUKWANG(3, "거북왕", PokemonType.WATER, 1000, 1, 125, 248),
    RAICHU(4, "라이츄", PokemonType.ELECTRIC, 1000, 1, 125, 248),
    LAFLESHI(5, "라플레시", PokemonType.GRASS, 1000, 1, 125, 248),
    BLAYBEOM(6, "블레이범", PokemonType.FIRE, 1000, 1, 125, 248),
    SUPERGOLDUCK(7, "슈퍼골덕", PokemonType.WATER, 1000, 1, 125, 248),
    DDAKGURI(8, "딱구리", PokemonType.ELECTRIC, 1000, 1, 125, 248),
    MEGANIUM(9, "메가니움", PokemonType.GRASS, 1000, 1, 125, 248),
    ELEVENTAIL(10, "일레븐테일", PokemonType.FIRE, 1000, 1, 125, 248),
    GANGCHANGI(11, "강챙이", PokemonType.WATER, 1000, 1, 125, 248),
    UNIQUECOIL(12, "유니크코일", PokemonType.ELECTRIC, 1000, 1, 125, 248),
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

    @Override
    public PokemonInformation getInformation() {
        return information;
    }
}
