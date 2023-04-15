package controller.menu.battle.view;

import static common.MakeCommon.*;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {
    private final String READY = "🚨 잠시 후 야생 포켓몬과의 전투가 시작됩니다 ‼️\n";
    private final String WARNING = "⚠️ ‼️‼️‼️‼️‼️‼️‼️\n";
    private final String APPEAR_FIRST = "\n\n야생의 [";
    private final String APPEAR_LAST = "] 이(가) 등장하였습니다. 😼\n";
    private final String INPUT_MENU = "매뉴를 선택해주세요. 👉\n\n";
    private final String DO_IT_FIGHT = "1. 싸우기 🥊\n";
    private final String EXIT_RUN = "2. 도망가기 🏃‍\n";
    private final String INPUT_FIGHT = "\n🥊⚔️🥊 싸우기를 선택하였습니다. 🥊⚔️🥊\n";
    private final String INPUT_RUN = "\n\n도망가기를 선택하였습니다. 🏃‍💨💨\n\n";
    private final String CHOICE_MY_POKEMON = "\n\n😼포켓몬을 😾 선택해주세요 🙀\n";
    private final String MY_POKEMON_LIST_START = "➖➖➖➖ 나의 포켓몬 리스트 ➖➖➖➖\n\n";
    private final String MY_POKEMON_LIST_END = "➖➖➖➖ ➖➖➖➖➖➖ ➖➖➖➖\n\n";
    private final String SUMMON = "😼포켓몬 이름을 입력해서 😾 소환할 수 있습니다. 🙀\n\n";
    private final int MILLIS = 30;
    private final int SHORT_MILLS = 5;

    public void appearWildPokemon(String wildPokemonName) {
        String message = READY + WARNING + APPEAR_FIRST + wildPokemonName + APPEAR_LAST;
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void choiceMenu() {
        String message = INPUT_MENU + DO_IT_FIGHT + EXIT_RUN;
        dottedPrint(message, MILLIS);
    }

    public void inputRun() {
        dottedPrint(INPUT_RUN, MILLIS);
    }

    public void inputFight() {
        dottedPrint(INPUT_FIGHT, MILLIS);
    }

    public void choiceMyPokemon() {
        String message = CHOICE_MY_POKEMON + MY_POKEMON_LIST_START;
        dottedPrint(message, SHORT_MILLS);
    }

    public void showMyPokemonInformation(String message) {
        dottedPrint(message + MY_POKEMON_LIST_END, SHORT_MILLS);
    }

    public void showSummon() {
        dottedPrint(SUMMON, MILLIS);
    }

    public void show(String message) {
        dottedPrint(message, MILLIS);
    }

    public void goMyPokemon(String playerPokemonName) {
        String messge = "[" + playerPokemonName + "] 을(를) 꺼냈습니다.\n"
                + "가라 [" + playerPokemonName + "] ❕❗️❕❗️❕❗️❕❗️\n\n";
        dottedPrint(messge, MILLIS);
    }
}