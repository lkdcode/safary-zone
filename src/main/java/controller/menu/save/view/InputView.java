package controller.menu.save.view;

/**
 * 유저로부터 입력을 받는 역할
 */

import controller.menu.garden.exception.ErrorMessage;
import controller.menu.save.exception.ErrormessageSave;

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

    /**
     * 파일 이름을 입력하고, 15자 이내로 입력했는지 검사합니다.
     * @return 15자 이내일시 true, 넘었을 시 false
     */
    public String inputFileName() {
        while(true) {
            String fileName = null;
            try {
                fileName = br.readLine();
                if (inputValidate.inputFileNameValidate(fileName)) return fileName;
                ErrormessageSave.NAME_LENGTH_OVER.print();
            } catch (IOException e) {
                ErrormessageSave.UNKNOWN_ERROR.print();
            }
        }
    }

    public String inputMenu() {
        while(true) {
            String inputMenuNumber = null;
            try {
                inputMenuNumber = br.readLine();
                if (inputValidate.menuNumberValidate(inputMenuNumber)) return inputMenuNumber;
                ErrormessageSave.INPUT_MENU.print();
            } catch (IOException e) {
                ErrormessageSave.UNKNOWN_ERROR.print();
            }
        }
    }
}
