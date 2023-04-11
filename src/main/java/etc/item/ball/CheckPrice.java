package etc.item.ball;

public class CheckPrice {
    private int masterBall;
    private int monsterBall;
    private int hyperBall;
    private boolean isEnough;

    private CheckPrice() {
        this.masterBall = 3000;
        this.monsterBall = 3000;
        this.hyperBall = 3000;
    }

    /**
     * 가격을 체크하는 메서드
     * @param monsterBall
     */
    public CheckPrice(MonsterBall monsterBall) {
        this();

        if (monsterBall == MonsterBall.MASTER) {
            isEnough = true;
            return;
        }

        if (monsterBall == MonsterBall.HYPER) {
            isEnough = true;
            return;
        }

        if (monsterBall == MonsterBall.MONSTER) {
            isEnough = true;
        }

    }

    public boolean isEnoughMoney() {
        return isEnough;
    }
}
