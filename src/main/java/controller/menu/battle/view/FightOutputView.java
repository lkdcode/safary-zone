package controller.menu.battle.view;

import user.Player;

import static common.MakeCommon.dottedPrint;

/**
 * 전투 결과를 출력해주는 클래스
 */
public class FightOutputView {
    private final int MILLIS = 30;

    /**
     * 공격 포켓몬과 타겟 포켓몬을 매개변수로 받아서
     * 한 턴의 공격 결과를 출력해줍니다.
     *
     * @param attacker : 공격하는 포켓몬스터의 이름
     * @param target   : 공격받는 포켓몬스터의 이름
     * @param damage   : 공격 데미지
     * @param targetHp : 데미지로 감소된 현재 체력
     */
    public void attackResult(String attacker, String target, int damage, int targetHp) {
        String message = "\n\n😼 [" + attacker + "] (이)가 🥊 ⚔️ [" + target + "] 을(를) 공격하였다 😵\n"
                + "...효과는 대단했다 ‼️\n"
                + "😵 [" + target + "] 의 체력이 [" + damage + "] 만큼 감소하였다 🩸\n"
                + "😵 [" + target + "] 의 현재 체력은 [" + targetHp + "] 이다 💔\n\n";

        dottedPrint(message, MILLIS);

    }

    public void loading() {
        String message = "전 투 중 . . . . . ⚔️ 🥊 ⚔️ 🥊 ⚔️ 🥊 ⚔️ 🥊 ⚔️ 🥊";
        dottedPrint(message, MILLIS);
    }

    public void lose() {
        String message = "패배 하였습니다. ㅠㅠ ㅠㅠ ㅠㅠ";
        dottedPrint(message, MILLIS);
    }

    public void win(boolean isGetWildPokemon, String wildPokemonName, String playerPokemonName, int money) {
        String message = "\n\n전투에서 승리하였습니다.\n\n"
                + playerPokemonName + "의 레벨이 1 상승하였습니다. (최대 : 10)\n";
        if (isGetWildPokemon) message += "야생의 [" + wildPokemonName + "] 을(를) 획득하였습니다.\n";
        message += "Player의 경험치가 올랐습니다.\n"
                + "[" + money + "] 원을 획득하였습니다.\n"
                + "메인 메뉴로 돌아갑니다. \n\n";

        dottedPrint(message, MILLIS);
    }

    public void fightExit() {
        String message = "🚫 # # # 전투 종료 # # # 🚫";
        dottedPrint(message, MILLIS);
    }
}
