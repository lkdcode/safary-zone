package controller.menu.battle.service;

import pokemon.pokemon.Pokemon;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class FightServiceLogic {
    private Pokemon wildPokemon;
    private Pokemon playerPokemon;
    private String attackerName;
    private String targetName;
    private int attackDamage;
    private boolean isSkillAttack;
    private int targetHp;

    public Pokemon playBattle(Pokemon wildPokemon, Pokemon playerPokemon) {
        this.wildPokemon = wildPokemon;
        this.playerPokemon = playerPokemon;
        return checkFirstAttack();
    }

    private Pokemon checkFirstAttack() {
        if (wildPokemon.getInformation().getLevel() > playerPokemon.getInformation().getLevel()) return wildPokemon;
        return playerPokemon;
    }

    public void attack(Pokemon attacker, Pokemon target) {
        this.attackerName = attacker.getInformation().getName();
        this.targetName = target.getInformation().getName();
        this.attackDamage = skillAttackCheck(attacker);
        this.targetHp = target.getInformation().getHp();
    }

    private int skillAttackCheck(Pokemon pokemon) {
        if (random(1, 100) <= 11.0) {
            this.isSkillAttack = true;
            return pokemon.getInformation().getSkillDamage();
        }

        this.isSkillAttack = false;
        return pokemon.getInformation().getDamage();
    }

    private double random(int minRange, int maxRange) {
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            return (instanceStrong.nextDouble() * maxRange) + minRange;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return (Math.random() * maxRange) + minRange;
    }


    public int getAttackDamage() {
        return attackDamage;
    }

    public boolean isSkillAttack() {
        return isSkillAttack;
    }

    public int getTargetHp() {
        return targetHp;
    }

    public String getAttackerName() {
        return attackerName;
    }

    public String getTargetName() {
        return targetName;
    }
}
