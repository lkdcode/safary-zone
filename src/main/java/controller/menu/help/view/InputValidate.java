package controller.menu.help.view;

public class InputValidate {
    private final String SHOP_HELP = "1";
    private final String GARDEN_HELP = "2";
    private final String CAPTURE_HELP = "3";
    private final String BATTLE_HELP = "4";
    private final String EVOLUTION_HELP = "5";
    private final String INFORMATION_HELP = "6";
    private final String SAVE_HELP = "7";
    private final String HELP_EXIT = "0";

    public boolean menu(String input) {
        if (input.equals(SHOP_HELP)
                || input.equals(GARDEN_HELP)
                || input.equals(CAPTURE_HELP)
                || input.equals(BATTLE_HELP)
                || input.equals(EVOLUTION_HELP)
                || input.equals(INFORMATION_HELP)
                || input.equals(SAVE_HELP)
                || input.equals(HELP_EXIT)
        ) return true;
        return false;
    }
}
