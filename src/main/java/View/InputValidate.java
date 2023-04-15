package View;

import controller.menu.esteregg.EsterEgg;

public class InputValidate {
    private final String SHOP_AND_EXIT = "1";
    private final String GARDEN_MENU_AND_EXIT = "2";
    private final String CAPTURE_MENU = "3";
    private final String BATTLE_MENU = "4";
    private final String EVOLUTION_MENU = "5";
    private final String INFORMATION_MENU = "6";
    private final String SAVE_MENU = "7";
    private final String HELP_MENU = "8";
    private final String EXIT_MENU = "0";


    public boolean menu(String inputMenu) {
        if (inputMenu.equals("20221227")) new EsterEgg().inputKey();
        if (inputMenu.equals(SHOP_AND_EXIT)
                || inputMenu.equals(GARDEN_MENU_AND_EXIT)
                || inputMenu.equals(CAPTURE_MENU)
                || inputMenu.equals(BATTLE_MENU)
                || inputMenu.equals(EVOLUTION_MENU)
                || inputMenu.equals(INFORMATION_MENU)
                || inputMenu.equals(SAVE_MENU)
                || inputMenu.equals(HELP_MENU)
                || inputMenu.equals(EXIT_MENU)
        ) return true;

        return false;
    }

    public boolean isExit(String inputMenu) {
        if (inputMenu.equals(SHOP_AND_EXIT)
                || inputMenu.equals(GARDEN_MENU_AND_EXIT)
        ) return true;

        return false;
    }
}
