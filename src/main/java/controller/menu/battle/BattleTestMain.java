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

//        new BattleController().start();
        Set<Integer> test = new HashSet<>();

        while(true){
            test.add((int) random(1, 12));
            System.out.println(test);
        }

    }

    private static double random(int minRange, int maxRange) {
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            return (instanceStrong.nextDouble() * maxRange) + minRange;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return (Math.random() * maxRange) + minRange;
    }

}
