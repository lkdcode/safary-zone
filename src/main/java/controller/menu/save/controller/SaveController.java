package controller.menu.save.controller;

import controller.menu.save.exception.ErrormessageSave;
import controller.menu.save.service.LoadFile;
import controller.menu.save.service.SaveFile;
import controller.menu.save.view.InputView;
import controller.menu.save.view.OutputView;

import static common.MakeCommon.*;

/**
 * 저장 / 불러오기 controller
 */
public class SaveController {

    private final String SAVE = "1";
    private final String LOAD = "2";
    private final String EXIT = "0";
    private final OutputView outputView;
    private final InputView inputView;
    private final LoadFile loadFile;
    private final SaveFile saveFile;

    public SaveController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.loadFile = new LoadFile();
        this.saveFile = new SaveFile();
    }

    public void start() {
        // 저장, 불러오기, 돌아가기 중에 고르는 메뉴 출력
        outputView.choiceMenu();
        // 메뉴 선택에 따라 메서드 실행
        // 메뉴 입력받기
        String menu = inputView.inputMenu();

        switch (menu) {
            case SAVE:
                save();
                stopLine();
                break;
            case LOAD:
                load();
                stopLine();
                break;
            case EXIT:
                outputView.exit();
                break;
            default:
                ErrormessageSave.INPUT_MENU.print();
        }
    }

    public void save() {
        outputView.saveFile();
        String saveFileName = inputView.inputFileName();
        if (saveFile.saveFile(saveFileName)) outputView.saveSuccess();
        else ErrormessageSave.SAVE_ERROR_MESSAGE.print();
    }

    public void load() {
        outputView.loadFile();
        String loadFileName = inputView.inputFileName();
        if (loadFile.loadFile(loadFileName)) outputView.loadSuccess();
        else ErrormessageSave.LOAD_ERROR_MESSAGE.print();
    }
}
