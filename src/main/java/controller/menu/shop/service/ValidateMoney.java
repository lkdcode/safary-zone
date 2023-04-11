package controller.menu.shop.service;

import User.Player;
import User.item.ball.MonsterBall;
import User.item.berry.Berry;

public class ValidateMoney implements TradeItem {
    private final int BLUEBERRY_PRICE = 500;
    private final int RASPBERRY_PRICE = 2000;
    private final int BLACKBERRY_PRICE = 3500;
    private final int NORMAL_MONSTER_BALL_PRICE = 1200;
    private final int HYPER_MONSTER_BALL_PRICE = 5000;
    private final int MASTER_MONSTER_BALL_PRICE = 7500;

    @Override
    public boolean isEnoughMoney(Object o, int quantity) {
        if (o instanceof Berry) return checkBerryPrice((Berry) o, quantity);
        else return checkMonsterBallPrice((MonsterBall) o, quantity);
    }

    private boolean checkBerryPrice(Berry berry, int quantity) {
        int playerMoney = Player.getInstance().getInventory().getMoney();
        switch (berry) {
            case BLUEBERRY:
                if (playerMoney >= BLUEBERRY_PRICE * quantity) return true;
            case RASPBERRY:
                if (playerMoney >= RASPBERRY_PRICE * quantity) return true;
            case BLACKBERRY:
                if (playerMoney >= BLACKBERRY_PRICE * quantity) return true;
        }
        return false;
    }

    private boolean checkMonsterBallPrice(MonsterBall monsterBall, int quantity) {
        int playerMoney = Player.getInstance().getInventory().getMoney();
        switch (monsterBall) {
            case NORMAL:
                if (playerMoney >= NORMAL_MONSTER_BALL_PRICE * quantity) return true;
            case HYPER:
                if (playerMoney >= HYPER_MONSTER_BALL_PRICE * quantity) return true;
            case MASTER:
                if (playerMoney >= MASTER_MONSTER_BALL_PRICE * quantity) return true;
        }
        return false;
    }
}