package safaryzone.user;

import safaryzone.user.item.ball.BallPouch;
import safaryzone.user.item.berry.BerryPouch;

import java.io.Serializable;

public class Inventory implements Serializable {
    private BallPouch ballPouch;
    private BerryPouch berryPouch;
    private int money;
    private final int START_MONEY = 5000;

    public Inventory() {
        this.ballPouch = new BallPouch();
        this.berryPouch = new BerryPouch();
        this.money = START_MONEY;
    }

    public BallPouch getBallPouch() {
        return ballPouch;
    }

    public BerryPouch getBerryPouch() {
        return berryPouch;
    }

    public int getMoney() {
        return money;
    }

    public void setMoneyByShop(int money) {
        this.money = money;
    }

    public void setMoneyByBattle(int money) {
        this.money += money;
    }
}
