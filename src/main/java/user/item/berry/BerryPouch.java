package User.item.berry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BerryPouch {
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
}
