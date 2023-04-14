package controller.menu.battle;

import controller.menu.battle.controller.BattleController;
import controller.menu.battle.service.SummonServiceLogic;
import pokemon.pokemon.Pokemon;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class BattleTestMain {
    public static void main(String[] args) {
        new BattleController().start();
        // TODO : 포켓몬스터 레벨 * 기본공격력으로 기본 공격력 셋업
        //        포켓몬스터 레벨 * 스킬공격력으로 스킬 공격력 셋업
    }

}
