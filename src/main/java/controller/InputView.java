package controller;


import controller.menu.capture.exception.ErrorMessage;
import controller.InputValidate;

import java.util.Scanner;

public class InputView {
    private final Scanner sc;
    private final InputValidate inputValidate;

    public InputView() {
        this.sc = new Scanner(System.in);
        this.inputValidate = new InputValidate();
    }

    public String selectMenu() {
        while (true) {
            String inputMenuNumber = sc.nextLine();
            if (inputValidate.menuNumber(inputMenuNumber))
                return inputMenuNumber;
            ErrorMessage.MENU.print();
        }
    }
}
