package safaryzone.controller.menu.battle.service;

import safaryzone.common.MakeCommon;
import safaryzone.controller.menu.battle.controller.WildPokemonList;
import safaryzone.pokemon.books.FinallyPokemonBooks;
import safaryzone.pokemon.books.NormalPokemonBooks;
import safaryzone.pokemon.books.RarePokemonBooks;
import safaryzone.pokemon.pokemon.Pokemon;
import safaryzone.user.Player;

/**
 * 야생의 포켓몬을 소환하는 클래스
 */
public class SummonServiceLogic {
    private final WildPokemonList wildPokemonList;
    private final int LOW_LEVEL = 3;
    private final int HIGH_LEVEL = 8;
    private final int RATE_RANGE_MAX = 100;
    private final int RATE_RANGE_MIN = 1;
    private final int MIN_BOOK_NUMBER = 1;

    public SummonServiceLogic() {
        this.wildPokemonList = new WildPokemonList();
    }

    /**
     * Player 의 레벨을 기준으로 등장하는 야생 포켓몬스터의 등급이 일정한 확률을 같습니다.
     * Lv1~3 : Normal 95%, Rare 4%, Finally 1%
     * Lv4~7 : Normal 30%, Rare 60%, Finally 10%
     * Lv8~10 : Normal 10%, Rare 60%, Finally 30%
     *
     * @return
     */
    public Pokemon getWildPokemon() {
        int playerLevel = Player.getInstance().getLevel();

        if (playerLevel <= LOW_LEVEL) return lowLevelSummon();
        if (playerLevel >= HIGH_LEVEL) return highLevelSummon();
        else return middleLevelSummon();
    }

    /**
     * Player 의 레벨에 따라 등장하는 야생 포켓몬스터의 등급이 달라집니다.
     * 난수를 생성했을 때 double 타입으로 리턴되기 때문에 최소 1.xxxxxx ~ 최대 100.xxxxx 의 범위가
     * 리턴됩니다. 만약에 99.9 이상이라면 약 1% 의 확률이며 이 확률이 걸린다면 finally 도감에 있는 포켓몬을 리턴하고
     * 5.0 이하라면 약 4% 의 확률이며 rare 도감에 있는 포켓몬스터를 리턴합니다.
     * 이외에는 전부 normal 포켓몬스터를 리턴합니다.
     *
     * @return
     */
    private Pokemon lowLevelSummon() {
        if (MakeCommon.getRandom(RATE_RANGE_MIN, RATE_RANGE_MAX) >= 99.9) return finallyPokemonRandomPick();
        if (MakeCommon.getRandom(RATE_RANGE_MIN, RATE_RANGE_MAX) <= 5.0) return rarePokemonRandomPick();
        else return normalPokemonRandomPick();
    }

    private Pokemon middleLevelSummon() {
        if (MakeCommon.getRandom(RATE_RANGE_MIN, RATE_RANGE_MAX) >= 89.9) return finallyPokemonRandomPick();
        if (MakeCommon.getRandom(RATE_RANGE_MIN, RATE_RANGE_MAX) <= 11.0) return rarePokemonRandomPick();
        else return normalPokemonRandomPick();
    }

    private Pokemon highLevelSummon() {
        if (MakeCommon.getRandom(RATE_RANGE_MIN, RATE_RANGE_MAX) >= 70.0) return finallyPokemonRandomPick();
        if (MakeCommon.getRandom(RATE_RANGE_MIN, RATE_RANGE_MAX) <= 11.0) return normalPokemonRandomPick();
        else return rarePokemonRandomPick();
    }

    /**
     * 포켓몬 도감에 있는 포켓몬스터들이 모두 밸류이며 .length 로 int 를 리턴받을 수 있습니다.
     * 도감의 사이즈(길이) 가 난수 생성의 최대값이 되고
     * 시작 인덱스인 1을 매개변수로 넘겨서 난수를 리턴 받습니다.
     * 이렇게 생성된 난수를 정수타입으로 형변환을 하고 포켓몬 리스트에서 get 하여
     * Pokemon 타입을 리턴받습니다.
     *
     * @return
     */
    private Pokemon normalPokemonRandomPick() {
        int normalBookSize = NormalPokemonBooks.values().length;
        int keyIndex = (int) MakeCommon.getRandom(MIN_BOOK_NUMBER, normalBookSize);

        return wildPokemonList.getNORMAL_POKEMON_LIST().get(keyIndex);
    }

    private Pokemon rarePokemonRandomPick() {
        int rareBookSize = RarePokemonBooks.values().length;
        int keyIndex = (int) MakeCommon.getRandom(MIN_BOOK_NUMBER, rareBookSize);

        return wildPokemonList.getRARE_POKEMON_LIST().get(keyIndex);
    }

    private Pokemon finallyPokemonRandomPick() {
        int finallyBookSize = FinallyPokemonBooks.values().length;
        int keyIndex = (int) MakeCommon.getRandom(MIN_BOOK_NUMBER, finallyBookSize);

        return wildPokemonList.getFINALLY_POKEMON_LIST().get(keyIndex);
    }

}