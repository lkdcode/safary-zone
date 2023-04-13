package user.item.ball;

public enum MonsterBall {
    NORMAL(15,700), HYPER(30,1000), MASTER(50,1500);

    private double rate;
    private int price;

    MonsterBall(double rate, int price) {
        this.rate = rate;
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public int getPrice() {
        return price;
    }
}
