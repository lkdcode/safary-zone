package safaryzone.controller.menu.battle.controller;

import safaryzone.controller.menu.battle.service.FightServiceLogic;
import safaryzone.controller.menu.battle.view.FightOutputView;
import safaryzone.pokemon.pokemon.Pokemon;

/**
 * 야생 몬스터와 배틀을 진행하는 컨트롤러
 */
public class FightController {
    private final FightServiceLogic fightServiceLogic;
    private final FightOutputView fightOutputView;
    private Pokemon wildPokemon;
    private Pokemon playerPokemon;
    private boolean isWon;

    public FightController() {
        this.fightServiceLogic = new FightServiceLogic();
        this.fightOutputView = new FightOutputView();
        this.isWon = false;
    }

    /**
     * 포켓몬 전투를 준비하는 메서드입니다.
     * 선공권 결정을 직접 비교하지 않고 전투의 결과값들을 보관하고 있는
     * FightServiceLogic 을 호출해 매개변수로 포켓몬들을 넘겨줍니다.
     * 선공권을 결정하고 전투를 진행하는 playFight() 메서드를 호출합니다.
     *
     * @param wildPokemon   : 야생 포켓몬스터
     * @param playerPokemon : Player 가 소환한 포켓몬스터
     */
    public void readyFight(Pokemon wildPokemon, Pokemon playerPokemon) {
        this.wildPokemon = wildPokemon;
        this.playerPokemon = playerPokemon;

        fightServiceLogic.setFight(wildPokemon, playerPokemon);
        playFight();
        result();
    }

    /**
     * 야생 포켓몬스터와 Player 의 포켓몬스터의 전투를 진행하는 메서드입니다.
     */
    private void playFight() {
        while (true) {
            fightServiceLogic.attack();
            fightOutputView.loading();
            attackResultView();
            if (fightServiceLogic.getTargetHp() <= 0) return;
        }
    }

    /**
     * 한 턴의 공격을 마치면 결과를 출력하는 메서드
     * outputView 를 호출해 결과에 필요한 매개변수를 넘겨줍니다.
     */
    private void attackResultView() {
        String attackerName = fightServiceLogic.getAttackerName();
        String targetName = fightServiceLogic.getTargetName();
        int damage = fightServiceLogic.getDamage();
        int targetHp = fightServiceLogic.getTargetHp();
        int fightFlag = (fightServiceLogic.getFightFlag()) % 2;

        fightOutputView.attackResult(attackerName, targetName, damage, targetHp, fightFlag);
    }

    /**
     * 전투의 최종 결과를 담당하는 메서드입니다.
     * 최종 결과를 출력해주고,
     * Player 의 상태를 업데이트해줍니다.
     */
    private void result() {
        fightOutputView.fightExit();
        // 승리시
        if (fightServiceLogic.isWon()) {
            win();
            return;
        }

        // 패배시
        lose();
    }

    private void win() {
        fightServiceLogic.fightResult();
        fightOutputView.win(fightServiceLogic.isGetWildPokemon(),
                wildPokemon.getInformation().getName(),
                playerPokemon.getInformation().getName(),
                fightServiceLogic.playerSetupMoney(),
                fightServiceLogic.isAlreadyHave());

        this.isWon = true;
    }

    private void lose() {
        fightOutputView.lose();
    }


    public boolean isWon() {
        return isWon;
    }
}
