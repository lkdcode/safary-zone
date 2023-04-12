package pokemon.pokemon;

import pokemon.PokemonInformation;

public interface Pokemon {
    // 객체를 묶어주기 위한 용도로 사용되는 최상위 인터페이스
    PokemonInformation getInformation();
}
