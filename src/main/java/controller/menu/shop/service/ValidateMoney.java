package controller.menu.shop.service;

import user.Player;
import user.item.ball.MonsterBall;
import user.item.berry.Berry;

public class ValidateMoney implements TradeItem {
    private final int BLUEBERRY_PRICE = 1000;
    private final int RASPBERRY_PRICE = 1200;
    private final int BLACKBERRY_PRICE = 1500;
    private final int NORMAL_MONSTER_BALL_PRICE = 1200;
    private final int HYPER_MONSTER_BALL_PRICE = 5000;
    private final int MASTER_MONSTER_BALL_PRICE = 7500;
    private final BuyItem buyItem;

    public ValidateMoney() {
        this.buyItem = new BuyItem();
    }

    @Override
    public boolean isEnoughMoney(Object o, int quantity) {
        if (o instanceof Berry) return checkBerryPrice((Berry) o, quantity);
        else return checkMonsterBallPrice((MonsterBall) o, quantity);
    }

    /**
     * 플레이어가 소지한 머니와 구매하려는 열매들의 가격을 비교합니다.
     * 소지 머니가 구매 가격보다 많을 경우,
     * 플레이어의 머니에서 구매 가격만큼 차감합니다.
     *
     * @param berry: 구매하려는 열매
     * @param quantity: 구매하려는 열매의 개수
     * @return 소지한 머니가 구매하려는 열매의 가격보다 많으면 true, 적으면 false 를 리턴합니다.
     */
    private boolean checkBerryPrice(Berry berry, int quantity) {
        int playerMoney = Player.getInstance().getInventory().getMoney();

        switch (berry) {
            case BLUEBERRY:
                if (playerMoney >= BLUEBERRY_PRICE * quantity) {
                    buyItem.setPlayerMoney(playerMoney - BLUEBERRY_PRICE * quantity);
                    return true;
                }
            case RASPBERRY:
                if (playerMoney >= RASPBERRY_PRICE * quantity) {
                    buyItem.setPlayerMoney(playerMoney - RASPBERRY_PRICE * quantity);
                    return true;
                }
            case BLACKBERRY:
                if (playerMoney >= BLACKBERRY_PRICE * quantity) {
                    buyItem.setPlayerMoney(playerMoney - BLACKBERRY_PRICE * quantity);
                    return true;
                }
        }
        return false;
    }

    /**
     * 위와 같은 로직
      */
    private boolean checkMonsterBallPrice(MonsterBall monsterBall, int quantity) {
        int playerMoney = Player.getInstance().getInventory().getMoney();
        switch (monsterBall) {
            case NORMAL:
                if (playerMoney >= NORMAL_MONSTER_BALL_PRICE * quantity) {
                    Player.getInstance().getInventory().setMoney(playerMoney - NORMAL_MONSTER_BALL_PRICE * quantity);
                    return true;
                }
            case HYPER:
                if (playerMoney >= HYPER_MONSTER_BALL_PRICE * quantity) {
                    Player.getInstance().getInventory().setMoney(playerMoney - HYPER_MONSTER_BALL_PRICE * quantity);
                    return true;
                }
            case MASTER:
                if (playerMoney >= MASTER_MONSTER_BALL_PRICE * quantity) {
                    Player.getInstance().getInventory().setMoney(playerMoney - MASTER_MONSTER_BALL_PRICE * quantity);
                    return true;
                }
        }
        return false;
    }
}