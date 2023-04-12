package controller.menu.battle.controller;

import controller.menu.battle.service.FightServiceLogic;
import controller.menu.battle.view.FightOutputView;
import pokemon.pokemon.Pokemon;

public class FightController {
    private final FightServiceLogic fightServiceLogic;
    private final FightOutputView fightOutputView;
    private Pokemon wildPokemon;
    private Pokemon playerPokemon;

    public FightController() {
        this.fightServiceLogic = new FightServiceLogic();
        this.fightOutputView = new FightOutputView();
    }

    public void readyFight(Pokemon whildPokemon, Pokemon playerPokemon) {
        this.wildPokemon = whildPokemon;
        this.playerPokemon = playerPokemon;
        if (whildPokemon.getInformation().getLevel() > playerPokemon.getInformation().getLevel()) {
            // 야생의 몬스터가 레벨이 더 높은 경우
            // 야생의 몬스터가 선빵
        }

        playFight();
    }

    private void playFight() {

        while (true) {
            fightServiceLogic.attack(playerPokemon, wildPokemon);
            attackResultView();

            if (fightServiceLogic.getTargetHp() <= 0) return;

            fightServiceLogic.attack(wildPokemon, playerPokemon);
            attackResultView();


            if (fightServiceLogic.getTargetHp() <= 0) return;
        }
    }

    private void attackResultView() {
        String attackerName = fightServiceLogic.getAttackerName();
        String targetName = fightServiceLogic.getTargetName();
        int damage = fightServiceLogic.getAttackDamage();
        int currentHp = fightServiceLogic.getTargetHp();
        boolean isSkillAttack = fightServiceLogic.isSkillAttack();

        fightOutputView.attackResult(attackerName, targetName, damage, currentHp, isSkillAttack);
    }

}
