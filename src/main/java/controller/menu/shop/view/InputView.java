package controller.menu.shop.view;

import User.item.ball.MonsterBall;
import User.item.berry.Berry;
import controller.menu.shop.exception.ErrorMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {
    private final BufferedReader br;
//    private final Scanner sc;

    private final InputValidate inputValidate;

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
//        this.sc = new Scanner(System.in);
        this.inputValidate = new InputValidate();
    }


    public String inputMenu() {
        while (true) {
            String inputMenuNumber = null;
            try {
                inputMenuNumber = br.readLine();
            } catch (IOException e) {
            }
            if (inputValidate.menuNumber(inputMenuNumber)) return inputMenuNumber;
            ErrorMessage.MENU.print();
        }
    }

    public MonsterBall inputMonsterBallNumber() {
        while (true) {
            String inputMonsterBallNumber = null;
            try {
                inputMonsterBallNumber = br.readLine();
            } catch (IOException e) {
            }
            MonsterBall monsterBall = inputValidate.monsterBallNumber(inputMonsterBallNumber);

            if (monsterBall != null) return monsterBall;
            ErrorMessage.MENU.print();
        }
    }

    public Berry inputBerryNumber() {
        while (true) {
            String inputBerryNumber = null;
            try {
                inputBerryNumber = br.readLine();
            } catch (IOException e) {
            }
            Berry berry = inputValidate.BerryNumber(inputBerryNumber);

            if (berry != null) return berry;
            ErrorMessage.MENU.print();
        }
    }

    public int inputQuantity() {
        while (true) {
            String inputQuantity = null;
            try {
                inputQuantity = br.readLine();
            } catch (IOException e) {
            }
            int quantity = inputValidate.quantity(inputQuantity);

            if (quantity != 0) return quantity;
            ErrorMessage.QUANTITY.print();
        }
    }
}
