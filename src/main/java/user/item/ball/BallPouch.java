package user.item.ball;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BallPouch {
    private Map<MonsterBall, Integer> ballPouch;

    public BallPouch() {
        this.ballPouch = new HashMap<>();
    }

    public void buyMonsterBall(MonsterBall monsterBall, int quantity) {
        if (ballPouch.get(monsterBall) == null) {
            ballPouch.put(monsterBall, quantity);
            return;
        }

        ballPouch.put(monsterBall, ballPouch.get(monsterBall) + quantity);
    }

    public Map<MonsterBall, Integer> getBallPouch() {
        return Collections.unmodifiableMap(ballPouch);
    }
}