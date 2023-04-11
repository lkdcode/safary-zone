package etc.item;

import java.util.HashMap;
import java.util.Map;

public class BallPouch {

    private Map<MonsterBall, Integer> ballPouch;

    public BallPouch() {
        this.ballPouch = new HashMap<>();
    }

    /**
     * 구매에 성공했다면 카운트 올리기
     * @param monsterBall : 구매한 볼의 종류
     */
    public void buyMonsterBall(MonsterBall monsterBall) {
        if (this.ballPouch.get(monsterBall) == null) {
            this.ballPouch.put(monsterBall, 1);
            return;
        }

        this.ballPouch.put(monsterBall, ballPouch.get(monsterBall) + 1);
    }


    @Override
    public String toString() {
        return "etc.item.BallPouch{" +
                "ballPouch=" + ballPouch +
                '}';
    }
}