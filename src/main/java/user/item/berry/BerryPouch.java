package user.item.berry;

import java.io.Serializable;
import java.util.*;

public class BerryPouch implements Serializable {
    private Map<Berry, Integer> berryPouch;

    public BerryPouch() {
        this.berryPouch = new HashMap<>();
        initialize();
    }

    /**
     * 시작시 열매 1개씩 가지고 시작하게 하는 메서드
     */
    private void initialize() {
        buyBerry(Berry.RASPBERRY, 1);
        buyBerry(Berry.BLACKBERRY, 1);
        buyBerry(Berry.BLUEBERRY, 1);
    }

    public void buyBerry(Berry berry, int quantity) {
        if (berryPouch.get(berry) == null) {
            berryPouch.put(berry, quantity);
            return;

        }
        berryPouch.put(berry, berryPouch.get(berry) + quantity);
    }

    public Map<Berry, Integer> getBerryPouch() {
        return Collections.unmodifiableMap(berryPouch);
    }

    /**
     * Garden(열매심기) 에서 사용합니다.
     * 파라미터인 berry 의 개수를 1개 줄입니다.
     *
     * @param berry : 열매심기에 사용한 열매
     */
    public void useOneBerry(Berry berry) {
        berryPouch.put(berry, berryPouch.get(berry) - 1);
    }

    public String getBerryList() {
        Queue<String> makeMyBerryList = new LinkedList<>();
        String myBerryList = "";

        for (Berry berry : berryPouch.keySet()) {
            makeMyBerryList.offer("🟢 Type : [" + berry + "], 수량 : [" + this.berryPouch.get(berry) + "] 개 \n");
        }

        for (Berry berry : Berry.values()) {
            while (true) {
                String checkMessage = makeMyBerryList.poll();
                if (checkMessage.contains(berry.toString())) {
                    myBerryList += checkMessage;
                    break;
                }
                makeMyBerryList.offer(checkMessage);
            }
        }

        return myBerryList;
    }

}