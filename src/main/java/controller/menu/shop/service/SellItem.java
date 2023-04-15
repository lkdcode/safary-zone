package controller.menu.shop.service;

import user.Player;

/**
 * 아이템을 판매하는 클래스
 */
public class SellItem {

    public SellItem() {
    }

    protected void setPlayerMoney(int price) {
        Player.getInstance().getInventory().setMoneyByShop(price);
    }
}
