package controller.menu.evolution.view;

import java.util.List;

public class InputValidate {
    private final String EVOLUTION_LIST = "1";
    private final String EVOLUTION = "2";
    private final String EXIT = "0";

    public boolean menu(String input) {
        if (input.equals(EVOLUTION_LIST)
                || input.equals(EVOLUTION)
                || input.equals(EXIT)) return true;
        return false;
    }

    public boolean evolution(String input, List<String> names) {
        if (names.contains(input)) return true;
        return false;
    }
}
