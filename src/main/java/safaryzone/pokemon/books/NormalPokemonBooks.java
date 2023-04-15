package safaryzone.pokemon.books;

import safaryzone.pokemon.PokemonType;
import safaryzone.pokemon.pokemon.NormalPokemon;
import safaryzone.pokemon.PokemonInformation;

/**
 * 일반 포켓몬스터 도감
 * bookNumber 는 진화가 가능한 종들의 고유 번호입니다 ex) bookNumber 1은 이상해씨, 이상해풀, 이상해꽃만 할당됨.
 * 나머지는 포켓몬이 가지고 있어야 할 정보들입니다.
 * PokemonInformation 을 빌더패턴으로 생성합니다.
 * NormalPokemon 을 구현합니다 (객체의 타입을 묶기 위한 용도입니다)
 */
public enum NormalPokemonBooks implements NormalPokemon {
    EESANGHAESSI(1, "이상해씨", PokemonType.GRASS, 10, 1, 5, 8),
    PYREE(2, "파이리", PokemonType.FIRE, 10, 1, 5, 8),
    GGOBUGI(3, "꼬부기", PokemonType.WATER, 10, 1, 5, 8),
    PICHU(4, "피츄", PokemonType.ELECTRIC, 10, 1, 5, 8),
    DDOBUKCHO(5, "뚜벅쵸", PokemonType.GRASS, 10, 1, 5, 8),
    BKAIN(6, "브케인", PokemonType.FIRE, 10, 1, 5, 8),
    GORAPADUCK(7, "고라파덕", PokemonType.WATER, 10, 1, 5, 8),
    GGOMADOL(8, "꼬마돌", PokemonType.ELECTRIC, 10, 1, 5, 8),
    CHIKORITA(9, "치코리타", PokemonType.GRASS, 10, 1, 5, 8),
    SIXTAIL(10, "식스테일", PokemonType.FIRE, 10, 1, 5, 8),
    BALCHANGI(11, "발챙이", PokemonType.WATER, 10, 1, 5, 8),
    COIL(12, "코일", PokemonType.ELECTRIC, 10, 1, 5, 8),
    ;
    private PokemonInformation information;

    NormalPokemonBooks(int bookNumber, String name, PokemonType type, int hp, int level, int damage, int skillDamage) {
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
