package controller.menu.playerinformation.view;

import controller.menu.playerinformation.view.InputValidate;
import controller.menu.shop.exception.ErrorMessage;
;
import java.util.Scanner;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {

    private final InputValidate inputValidate;
    private Scanner sc;


    public InputView() {
        this.inputValidate = new InputValidate();
    }

    public String menu() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                String inputMenu = sc.nextLine();
                if (inputValidate.menu(inputMenu)) return inputMenu;
            } catch (Exception e) {
                e.printStackTrace();
            }
            ErrorMessage.MENU.print();
        }
    }
}
