package user;

import user.item.ball.BallPouch;
import user.item.berry.BerryPouch;

public class Inventory {
    private BallPouch ballPouch;
    private BerryPouch berryPouch;
    private int money;
    private final int START_MONEY = 50000;

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

    public void setMoney(int money) {
        this.money = money;
    }
}
