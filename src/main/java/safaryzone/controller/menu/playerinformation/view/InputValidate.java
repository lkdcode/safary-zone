package safaryzone.controller.menu.playerinformation.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {
    private final String INVENTORY_MENU = "1";
    private final String POKEMON_LIST_MENU = "2";
    private final String EXIT = "0";

    public boolean menu(String inputMenu) {
        if (inputMenu.equals(INVENTORY_MENU)
                || inputMenu.equals(POKEMON_LIST_MENU)
                || inputMenu.equals(EXIT)) return true;
        return false;
    }


}
