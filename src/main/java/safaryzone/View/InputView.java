package safaryzone.View;

import safaryzone.controller.menu.shop.exception.ErrorMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private final BufferedReader br;
    private final InputValidate inputValidate;

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.inputValidate = new InputValidate();
    }

    public String menu() {
        while (true) {
            try {
                String inputMenu = br.readLine();
                if (inputValidate.menu(inputMenu)) return inputMenu;
            } catch (IOException e) {
                e.printStackTrace();
            }
            ErrorMessage.MENU.print();
        }
    }

    public String isExit() {
        while (true) {
            try {
                String inputMenu = br.readLine();
                if (inputValidate.isExit(inputMenu)) return inputMenu;
            } catch (IOException e) {
                e.printStackTrace();
            }
            ErrorMessage.MENU.print();
        }
    }
}
