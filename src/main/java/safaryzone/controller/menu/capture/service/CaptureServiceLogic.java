package safaryzone.controller.menu.capture.service;

import safaryzone.controller.menu.battle.service.SummonServiceLogic;
import safaryzone.pokemon.books.FinallyPokemonBooks;
import safaryzone.pokemon.books.NormalPokemonBooks;
import safaryzone.pokemon.books.RarePokemonBooks;
import safaryzone.pokemon.pokemon.Pokemon;
import safaryzone.common.MakeCommon;
import safaryzone.user.Player;
import safaryzone.user.item.ball.MonsterBall;

import static safaryzone.user.item.ball.MonsterBall.*;

public class CaptureServiceLogic {
    private final Pokemon wildPokemon;
    private double captureRate;
    private double runRate;
    private final double NORMAL_BALL_RATE = 30;
    //    private final double NORMAL_BALL_RATE = 50; // TODO : TEST LJF
    private final double HYPER_BALL_RATE = 50;
    //    private final double HYPER_BALL_RATE = 50; // TODO : TEST LJF
    private final double MASTER_BALL_RATE = 75;
    //    private final double MASTER_BALL_RATE = 100; // TODO : TEST LJF
    private final double POINT = 5;
    private final int MAX_RANGE = 100;
    private final int MIN_RANGE = 1;
    private final double DEFAULT_GO_NEAR_SUCCESS_RATE = 50.0;
    private double successPoint = 0;
    private boolean isAlready;

    public CaptureServiceLogic() {
        this.wildPokemon = new SummonServiceLogic().getWildPokemon();
        initialize();
    }

    /**
     * 랜덤으로 등장한 야생 포켓몬의 등급에 따라 도망갈 확률을 설정합니다.
     * 노말 등급인 경우 도망갈 확률 30%
     * 레어 등급인 경우 도망갈 확률 40%
     * 파이널리 등급인 경우 도망갈 확률 50%
     */
    private void initialize() {
        if (this.wildPokemon instanceof NormalPokemonBooks) this.runRate = 30;
        else if (this.wildPokemon instanceof RarePokemonBooks) this.runRate = 40;
        else if (this.wildPokemon instanceof FinallyPokemonBooks) this.runRate = 50;
        checkAlready();
    }

    /**
     * 유저가 선택한 몬스터 볼의 등급을 기준으로 포획 확률을 셋업해줍니다.
     * reduceBall() 메서드를 통해 유저가 사용한 몬스터 볼의 수량을 1 감소 시켜줍니다.
     * resultCalculator() 메서드를 통해 포획 성공 여부를 리턴합니다.
     *
     * @param ball : 유저가 선택한 몬스터 볼
     * @return
     */
    public boolean throwBall(MonsterBall ball) {
        if (ball == NORMAL) this.captureRate = NORMAL_BALL_RATE + successPoint;
        else if (ball == HYPER) this.captureRate = HYPER_BALL_RATE + successPoint;
        else if (ball == MASTER) this.captureRate = MASTER_BALL_RATE + successPoint;
        reduceBall(ball);
        return resultCalculator();
    }

    private void reduceBall(MonsterBall ball) {
        Player.getInstance().getInventory().getBallPouch().usedBall(ball);
    }

    /**
     * 몬스터 볼의 등급에 따라 다른 확률로 계산되어 포획 확률을 리턴합니다.
     * 포획에 성공했다면, addWildPokemon() 메서드를 통해 플레이어의 포켓몬 리스트에 추가합니다.
     *
     * @return
     */
    private boolean resultCalculator() {
        if (this.captureRate > MakeCommon.getRandom(MIN_RANGE, MAX_RANGE)) {
            addWildPokemon();
            return true;
        }

        return false;
    }

    private void checkAlready() {
        for (Pokemon playerPokemon : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            if (playerPokemon != null
                    && playerPokemon.getInformation().getName().equals(wildPokemon.getInformation().getName())) {
                this.isAlready = true;
            }
        }
    }


    /**
     * 1. 야생 포켓몬스터를 이미 보유하고 있다면 해당 메서드를 종료합니다.
     * 2. 야생 포켓몬스터의 도감 번호를 가져옵니다.
     * 3. 도감 번호를 기준으로 플레이어에게서 꺼내옵니다.
     * 4. 만약에, (꺼내온 플레이어의 포켓몬스터, 야생 몬스터)
     * - 플레이어의 포켓몬스터가 노말 등급이면서 야생 몬스터가 레어 등급이라면 추가합니다.
     * - 플레이어의 포켓몬스터가 노말 등급이면서 야생 몬스터가 파이널리 등급이라면 추가합니다.
     * - 플레이어의 포켓몬스터가 레어 등급이면서 야생 몬스터가 파이널리 등급이라면 추가합니다.
     * - 플레이어의 포켓몬스터가 비어있다면(null) 추가합니다.
     * 위의 경우가 아니라면
     * 1. 보유하고 있는 포켓몬스터가 적어도 레벨이 같거나 높기 때문에 추가해주지 않습니다.
     * 2. 보유하고 있는 포켓몬스터의 등급이 적어도 같거나 높기 때문에 추가해주지 않습니다.
     */
    private void addWildPokemon() {
        if (isAlready) return;
        int bookNumber = this.wildPokemon.getInformation().getBookNumber();
        Pokemon playerPokemon = Player.getInstance().getPokemonList().playerPokemonList().get(bookNumber);

        if ((playerPokemon instanceof NormalPokemonBooks && wildPokemon instanceof RarePokemonBooks)
                || (playerPokemon instanceof NormalPokemonBooks && wildPokemon instanceof FinallyPokemonBooks)
                || (playerPokemon instanceof RarePokemonBooks && wildPokemon instanceof FinallyPokemonBooks)
                || playerPokemon == null) {
            Player.getInstance().getPokemonList().playerPokemonList().put(bookNumber, this.wildPokemon);
        }
    }


    /**
     * 다가가기 성공 여부를 리턴합니다.
     * 성공시에 포획 확률을 올려줍니다.
     *
     * @return
     */
    public boolean isNearSuccess() {
        if (MakeCommon.getRandom(MIN_RANGE, MAX_RANGE) <= DEFAULT_GO_NEAR_SUCCESS_RATE) {
            successPoint += POINT;
            return true;
        }
        return false;
    }

    /**
     * 야생 포켓 몬스터의 등급에 따라 도망가는 확률을 적용하였습니다.
     * 그 확률을 기준으로 항상 도망갈 수 있는 상황을 만들어주는 메서드입니다.
     *
     * @return
     */
    public boolean isRun() {
        if (this.runRate <= MakeCommon.getRandom(MIN_RANGE, MAX_RANGE)) return false;
        return true;
    }

    /**
     * 등장한 야생 포켓몬스터의 이름을 리턴합니다.
     *
     * @return
     */
    public String getWildPokemonName() {
        return wildPokemon.getInformation().getName();
    }

    public boolean isAlready() {
        return isAlready;
    }
}
