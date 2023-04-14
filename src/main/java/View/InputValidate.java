package View;

import controller.menu.esteregg.EsterEgg;

public class InputValidate {
    private final String SHOP_AND_EXIT = "1";
    private final String GARDEN_MENU_AND_EXIT = "2";
    private final String CAPTURE_MENU = "3";
    private final String BATTLE_MENU = "4";
    private final String INFORMATION_MENU = "5";
    private final String SAVE_MENU = "6";
    private final String EXIT = "7";


    public boolean menu(String inputMenu) {
        if (inputMenu.equals("20221227")) new EsterEgg().inputKey();
        if (inputMenu.equals(SHOP_AND_EXIT)
                || inputMenu.equals(GARDEN_MENU_AND_EXIT)
                || inputMenu.equals(CAPTURE_MENU)
                || inputMenu.equals(BATTLE_MENU)
                || inputMenu.equals(INFORMATION_MENU)
                || inputMenu.equals(SAVE_MENU)
                || inputMenu.equals(EXIT)
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
