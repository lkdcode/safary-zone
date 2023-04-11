package User;

import User.item.ball.BallPouch;
import User.item.berry.BerryPouch;

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

}
