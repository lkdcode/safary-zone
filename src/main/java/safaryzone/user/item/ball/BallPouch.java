package safaryzone.user.item.ball;

import java.io.Serializable;
import java.util.*;

public class BallPouch implements Serializable {
    private Map<MonsterBall, Integer> ballPouch;

    public BallPouch() {
        this.ballPouch = new HashMap<>();
        initialize();
    }

    /**
     * TODO : TEST 시작부터 몬스터볼을 1개씩 가지고 시작함
     */
    private void initialize() {
        for (MonsterBall monsterBall : MonsterBall.values()) {
            this.ballPouch.put(monsterBall, 1);
        }
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

    public void usedBall(MonsterBall ball) {
        if (this.ballPouch.get(ball) > 0) {
            this.ballPouch.put(ball, this.ballPouch.get(ball) - 1);
        }
    }

    public String getBallList() {
        Queue<String> makeMyBerryList = new LinkedList<>();
        String myBallList = "";

        for (MonsterBall monsterBall : ballPouch.keySet()) {
            if (monsterBall != null)
                makeMyBerryList.offer("🔴 Type : [" + monsterBall + "], 수량 : [" + this.ballPouch.get(monsterBall) + "] 개 \n");
        }


        for (MonsterBall ball : MonsterBall.values()) {
            while (true) {
                String checkMessage = makeMyBerryList.poll();
                if (checkMessage.contains(ball.toString())) {
                    myBallList += checkMessage;
                    break;
                }
                makeMyBerryList.offer(checkMessage);
            }
        }


        return myBallList;
    }
}