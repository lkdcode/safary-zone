package controller.menu.battle.service;

import common.MakeCommon;
import pokemon.PokemonType;
import pokemon.books.FinallyPokemonBooks;
import pokemon.books.NormalPokemonBooks;
import pokemon.books.RarePokemonBooks;
import pokemon.pokemon.Pokemon;
import user.Player;

import static pokemon.PokemonType.*;

/**
 * 전투의 결과를 보관하는 클래스
 * 매 전투시 필드값들을 업데이트 시켜 보관합니다.
 * TODO : 리팩터링 필요
 */
public class FightServiceLogic {
    private Pokemon wildPokemon;
    private String wildPokemonName;
    private int wildPokemonHp;
    private int wildPokemonDamage;
    private int wildPokemonSkillDamage;
    private Pokemon playerPokemon;
    private String playerPokemonName;
    private int playerPokemonHp;
    private int playerPokemonDamage;
    private int playerPokemonSkillDamage;
    private int fightFlag;
    private int targetHp;
    private boolean isSkillAttack;


    /**
     * 야생 포켓몬스터와 Player 의 포켓몬스터를 매개변수로 받아
     * 필드 속성을 셋업해줍니다.
     *
     * @param wildPokemon   : 야생 포켓몬스터
     * @param playerPokemon : Player 의 포켓몬스터
     */
    public void setFight(Pokemon wildPokemon, Pokemon playerPokemon) {
        this.wildPokemon = wildPokemon;
        this.wildPokemonName = this.wildPokemon.getInformation().getName();
        this.wildPokemonHp = this.wildPokemon.getInformation().getHp();
        this.wildPokemonDamage = this.wildPokemon.getInformation().getDamage();
        this.wildPokemonSkillDamage = this.wildPokemon.getInformation().getSkillDamage();

        this.playerPokemon = playerPokemon;
        this.playerPokemonName = this.playerPokemon.getInformation().getName();
        this.playerPokemonHp = this.playerPokemon.getInformation().getHp();
        this.playerPokemonDamage = this.playerPokemon.getInformation().getDamage();
        this.playerPokemonSkillDamage = this.playerPokemon.getInformation().getSkillDamage();

        setFirstAttack();
        setDamageByType();
    }

    /**
     * 선공권을 결정해주는 메서드
     */
    private void setFirstAttack() {
        this.fightFlag = wildPokemon.getInformation().getLevel() > playerPokemon.getInformation().getLevel() ? 1 : 0;
    }

    /**
     * 타입 상성에 따라서 데미지를 증가시켜주는 메서드
     */
    private void setDamageByType() {
        PokemonType playerPokemonType = this.playerPokemon.getInformation().getType();
        PokemonType wildPokemonType = this.wildPokemon.getInformation().getType();
        setPlayerPokemonDamageByType(playerPokemonType, wildPokemonType);
        setWildPokemonDamageByType(playerPokemonType, wildPokemonType);
    }

    private void setPlayerPokemonDamageByType(PokemonType playerPokemonType, PokemonType wildPokemonType) {
        if ((playerPokemonType == WATER && wildPokemonType == FIRE)
                || (playerPokemonType == FIRE && wildPokemonType == GRASS)
                || (playerPokemonType == GRASS && wildPokemonType == WATER)
                || (playerPokemonType == ELECTRIC && wildPokemonType == WATER)) {
            playerPokemonDamage = (int) (playerPokemonDamage * 1.2);
            playerPokemonSkillDamage = (int) (playerPokemonSkillDamage * 1.2);
        }
    }

    private void setWildPokemonDamageByType(PokemonType playerPokemonType, PokemonType wildPokemonType) {
        if ((wildPokemonType == WATER && playerPokemonType == FIRE)
                || (wildPokemonType == FIRE && playerPokemonType == GRASS)
                || (wildPokemonType == GRASS && playerPokemonType == WATER)
                || (wildPokemonType == ELECTRIC && playerPokemonType == WATER)) {
            wildPokemonDamage = (int) (wildPokemonDamage * 1.2);
            wildPokemonSkillDamage = (int) (wildPokemonSkillDamage * 1.2);
        }
    }

    /**
     * 필드 값 fightCount 가 홀수면 플레이어가 공격하는 차례고 짝수이면 야생 몬스터가 공격하는 차례입니다.
     * setSkillAttack() 를 호출하여 스킬로 공격하는지 확인해주고
     * damage 로 hp 를 감소 시킵니다.
     * 추후 targetHp 를 업데이트 시켜줍니다.
     */
    public void attack() {
        setSkillAttack();
        if (fightFlag++ % 2 == 0) {
            playerPokemonAttack();
        } else {
            wildPokemonAttack();
        }

    }

    public boolean isWon() {
        if (fightFlag % 2 == 1) return true;
        return false;
    }


    /**
     * 전투 결과를 담당하는 메서드
     * 승리시 로직
     * 1. 일정 확률로 해당 야생 포켓몬스터를 획득할 수 있습니다.
     * 2. 전투에 참여한 포켓몬스터의 레벨을 1 상승 시킵니다. (최대 : 10)
     * 3. 플레이어의 경험치를 올려줍니다. (전투에 3번 참가시 레벨을 1 올려줍니다. 최대 : 10)
     * 4. 포켓몬스터의 등급에 따라 게임 머니를 획득합니다.
     */
    public void fightResult() {
        addExp();
    }

    /**
     * 1. 일정 확률로 해당 야생 포켓몬스터를 획득할 수 있습니다.
     *
     * @return
     */
    public boolean isGetWildPokemon() {
        if (MakeCommon.getRandom(1, 100) <= 11) {
            Player.getInstance().getPokemonList().playerPokemonList().put(wildPokemon.getInformation().getBookNumber(), wildPokemon);
            return true;
        }

        return false;
    }

    /**
     * 2. 전투에 참여한 포켓몬스터의 레벨을 1 상승 시킵니다. (최대 : 10)
     * 3. 플레이어의 경험치를 올려줍니다. (전투에 3번 참가시 레벨을 1 올려줍니다. 최대 : 10)
     */
    private void addExp() {
        Pokemon pokemon = playerPokemon;
        if (pokemon.getInformation().getLevel() < 10) pokemon.getInformation().setLevel(1);
        Player.getInstance().getPokemonList().playerPokemonList().put(pokemon.getInformation().getBookNumber(), pokemon);
        Player.getInstance().addExp(1);
    }

    /**
     * 4. 포켓몬스터의 등급에 따라 게임 머니를 획득합니다.
     * NormalPokemon : 200₩ ~ 500₩
     * RarePokemon : 400₩ ~ 800₩
     * FinallyPokemon : 700₩ ~ 1200₩
     */
    public int playerSetupMoney() {
        int money = 0;
        if (wildPokemon instanceof NormalPokemonBooks) {
            money = (int) MakeCommon.getRandom(200, 500);
        }
        if (wildPokemon instanceof RarePokemonBooks) {
            money = (int) MakeCommon.getRandom(400, 800);
        }
        if (wildPokemon instanceof FinallyPokemonBooks) {
            money = (int) MakeCommon.getRandom(700, 1200);
        }
        Player.getInstance().getInventory().setMoney(money);
        return money;
    }

    /**
     * Player 의 포켓몬스터가 야생 포켓몬을 공격하는 메서드
     */
    private void playerPokemonAttack() {
        if (isSkillAttack) {
            this.wildPokemonHp -= this.playerPokemonSkillDamage;
        } else {
            this.wildPokemonHp -= this.playerPokemonDamage;
        }
        this.targetHp = this.wildPokemonHp;
    }

    /**
     * 야생 포켓몬이 Player 의 포켓몬스터를 공격하는 메서드
     */
    private void wildPokemonAttack() {
        if (isSkillAttack) {
            this.playerPokemonHp -= this.wildPokemonSkillDamage;
        } else {
            this.playerPokemonHp -= this.wildPokemonDamage;
        }
        this.targetHp = this.playerPokemonHp;
    }


    /**
     * 포켓몬스터의 스킬 공격 확률을 계산하여 적용시킵니다.
     *
     * @return
     */
    private void setSkillAttack() {
        if (MakeCommon.getRandom(1, 100) <= 11.0) {
            this.isSkillAttack = true;
            return;
        }
        this.isSkillAttack = false;
    }

    public int getTargetHp() {
        return targetHp;
    }

    /**
     * 한 턴의 공격이 끝난 뒤 결과를 출력하기 위해 매개변수로 .get 하게 됩니다.
     * 위의 attack() 메서드 로직에서 fightCount 가 홀수면 플레이어가 공격을 합니다.
     * 공격 메서드가 실행된 후에 fightCount++ 을 해주기 때문에
     * 현재 fightCount 가 짝수면 플레이어가 공격했다는 뜻이고
     * 홀수면 야생 포켓몬이 공격했다는 뜻이 됩니다.
     *
     * @return
     */
    public String getAttackerName() {
        if (fightFlag % 2 == 1) {
            // Player 가 공격했다면,
            return this.playerPokemonName;
        } else {
            return this.wildPokemonName;
        }
    }

    public String getTargetName() {
        if (fightFlag % 2 == 1) {
            // 야생 포켓몬이 타겟이라면,
            return this.wildPokemonName;
        } else {
            return this.playerPokemonName;
        }
    }

    public int getDamage() {
        if (fightFlag % 2 == 1) {
            return this.isSkillAttack ? this.playerPokemonSkillDamage : this.playerPokemonDamage;
        } else {
            return this.isSkillAttack ? this.wildPokemonSkillDamage : this.wildPokemonDamage;
        }
    }

}
