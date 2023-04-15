package safaryzone.controller.menu.evolution.view;

import safaryzone.controller.menu.battle.exception.ErrorMessageBattle;
import safaryzone.controller.menu.shop.exception.ErrorMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

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
                String input = br.readLine();
                if (inputValidate.menu(input)) return input;
            } catch (IOException e) {
                e.printStackTrace();
            }
            ErrorMessage.MENU.print();
        }
    }

    public String evolution(List<String> names) {
        while (true) {
            try {
                String input = br.readLine();
                if (inputValidate.evolution(input, names)) return input;
            } catch (IOException e) {
                e.printStackTrace();
            }

            ErrorMessageBattle.INPUT_MY_POKEMON_NAME.print();
        }
    }
}
