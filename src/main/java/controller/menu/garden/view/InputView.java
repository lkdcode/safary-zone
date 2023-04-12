package controller.menu.garden.view;

import controller.menu.garden.exception.ErrorMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {

    private final BufferedReader br;
    private final InputValidate inputValidate;

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.inputValidate = new InputValidate();
    }

    public String inputMenu() {

        while(true) {
            String inputMenuNumber = null;
            try {
                inputMenuNumber = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (inputValidate.menuNumber(inputMenuNumber)) return inputMenuNumber;
            ErrorMessage.GARDEN_MENU.print();
        }
    }
}
