package safaryzone.pokemon.pokemon;

public interface NormalPokemon extends Pokemon {
    // 최상위 인터페이스인 Pokemon을 extends 해서 하위 클래스로 선언합니다.
    // 해당 인터페이스는 NormalPokemonBooks 가 구현하기 때문에
    // 결국 NormalPokemonBooks 는 Pokemon 타입에 들어갈 수 있습니다.
}
