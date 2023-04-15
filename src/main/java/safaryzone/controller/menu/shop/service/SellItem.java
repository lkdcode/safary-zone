package safaryzone.controller.menu.shop.service;

import safaryzone.user.Player;

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
