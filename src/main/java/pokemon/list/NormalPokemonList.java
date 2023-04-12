package pokemon.list;

import pokemon.books.NormalPokemonBooks;
import pokemon.pokemon.Pokemon;

import java.util.HashMap;
import java.util.Map;

/**
 * 일반 포켓몬스터 리스트
 * 일반 포켓몬스터 도감만 map으로 보관합니다.
 * key 가 Integer, value 가 Pokemon 입니다.
 * bookNumber 를 key 값으로 사용하여 포켓몬스터의 진화를 구현하려 합니다.
 * bookNumber 로 1을 넣으면 이상해씨, 이상해풀, 이상해꽃 중 현재 벨류에 있는 값을 리턴하고
 * 만약에 이상해씨가 진화 조건이 충족되면 RarePokemon인 이상해풀로 .put 해주어서 맵을 업데이트 해줄 수 있습니다.
 * map.put(key, value) -> 키 값이 존재하면 수정, 없으면 추가
 */
public class NormalPokemonList {
    private final Map<Integer, Pokemon> NORMAL_POKEMON_LIST;

    public NormalPokemonList() {
        this.NORMAL_POKEMON_LIST = new HashMap<>();
        normalPokemonLIstInitialize();
    }

    /**
     * For-Each 반복문을 돌면서 해당 맵을 갱신해줍니다.
     * normalPokemon 의 bookNumber 를 키로, normalPokemon 을 밸류로 추가합니다.
     * 이때 NormalPoekonBooks 가 implements NormalPokemon 하지 않았다면
     * Map<Integre, Pokemon> 에 추가가 되지 않기 때문에 하나의 객체로 묶어주는 용도로
     * Pokemon - NormalPokemon 을 묶어주었습니다.
     */
    private void normalPokemonLIstInitialize() {
        for (NormalPokemonBooks normalPokemon : NormalPokemonBooks.values()) {
            this.NORMAL_POKEMON_LIST.put(normalPokemon.getInformation().getBookNumber(), normalPokemon);
        }
    }

    public Map<Integer, Pokemon> getNORMAL_POKEMON_LIST() {
        return NORMAL_POKEMON_LIST;
    }
}
