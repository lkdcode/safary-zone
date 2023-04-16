package safaryzone.controller.menu.save.controller;

import safaryzone.controller.menu.save.Path;
import safaryzone.controller.menu.save.exception.ErrormessageSave;
import safaryzone.controller.menu.save.service.LoadFile;
import safaryzone.controller.menu.save.service.SaveFile;
import safaryzone.controller.menu.save.view.InputValidate;
import safaryzone.controller.menu.save.view.InputView;
import safaryzone.controller.menu.save.view.OutputView;
import safaryzone.common.MakeCommon;

import static safaryzone.controller.menu.save.Path.*;

/**
 * 저장 / 불러오기 controller
 */
public class SaveController {

    private final String SAVE = "1";
    private final String LOAD = "2";
    private final String EXIT = "0";
    private final OutputView outputView;
    private final InputView inputView;
    private final InputValidate inputValidate;
    private final LoadFile loadFile;
    private final SaveFile saveFile;

    public SaveController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.loadFile = new LoadFile();
        this.saveFile = new SaveFile();
        this.inputValidate = new InputValidate();
    }

    public void start() {
        // 저장, 불러오기, 돌아가기 중에 고르는 메뉴 출력
        while (true) {
            outputView.choiceMenu();
            // 메뉴 선택에 따라 메서드 실행
            // 메뉴 입력받기
            String menu = inputView.inputMenu();

            switch (menu) {
                case SAVE:
                    save();
                    MakeCommon.stopLine();
                    break;
                case LOAD:
                    load();
                    MakeCommon.stopLine();
                    break;
                case EXIT:
                    outputView.exit();
                    return;
                default:
                    ErrormessageSave.INPUT_MENU.print();
            }
        }
    }

    public void save() {
        String inputFileName;
        outputView.fileList();
        loadFile.fileList();
        while (true) {
            outputView.saveFile();
            inputFileName = inputView.inputFileName();
            // 파일명 중복 체크
            String file = PATH + "/" + inputFileName + ".sav";
            if (inputValidate.isLiveFile(file)) {
                // 파일이 이미 존재하는 경우
                outputView.fileDuplicationMenu();
                String menu = inputView.inputDupMenu();
                switch(menu) {
                    case "1":
                        break;
                    case "2":
                        continue;
                    default:
                        ErrormessageSave.INPUT_MENU.print();
                }
            }
            break;
        }

        if (saveFile.saveFile(inputFileName)) outputView.saveSuccess();
        else ErrormessageSave.SAVE_ERROR_MESSAGE.print();
    }

    private void fileDuplicate() {

    }

    public void load() {
        outputView.fileList();
        loadFile.fileList();
        outputView.loadFile();
        String loadFileName = inputView.inputFileName();
        if (loadFile.loadFile(loadFileName)) outputView.loadSuccess();
        else ErrormessageSave.LOAD_ERROR_MESSAGE.print();
    }

}
