package controller.menu.battle.view;

import controller.menu.shop.exception.ErrorMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {
    private final BufferedReader br;
    private final InputValidate validate;

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.validate = new InputValidate();
    }

    public String battleMenu() {
        String inputMenu = "";
        while (true) {
            try {
                inputMenu = br.readLine();
            } catch (IOException e) {
            }
            if (validate.menuNumber(inputMenu)) {
                return inputMenu;
            }
            ErrorMessage.MENU.print();
        }
    }

    public String choiceMyPokemon() {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
