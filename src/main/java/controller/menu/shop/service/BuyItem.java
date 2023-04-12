package controller.menu.shop.service;

import user.Player;
import user.item.ball.MonsterBall;
import user.item.berry.Berry;

public class BuyItem {

    public BuyItem() {
    }

    public void addMonsterBall(MonsterBall monsterBall, int quantity) {
        Player.getInstance().getInventory()
                .getBallPouch().buyMonsterBall(monsterBall, quantity);
    }

    public void addBerry(Berry berry, int quantity) {
        Player.getInstance().getInventory()
                .getBerryPouch().buyBerry(berry, quantity);
    }

    private void setPlayerMoney(int price) {

    }
}