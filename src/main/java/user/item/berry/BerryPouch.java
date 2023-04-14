package user.item.berry;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BerryPouch implements Serializable {
    private Map<Berry, Integer> berryPouch;

    public BerryPouch() {
        this.berryPouch = new HashMap<>();
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
        String myBerryList = "";
        for (Berry berry : berryPouch.keySet()) {
            if (berry != null)
                myBerryList += "🟢 Type : [" + berry + "], 수량 : [" + this.berryPouch.get(berry) + "] 개 \n";
        }

        return myBerryList;
    }

}
